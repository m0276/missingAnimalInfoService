package MJ.missingAnimalInfo.service;

import MJ.missingAnimalInfo.dto.request.FavRequest;
import MJ.missingAnimalInfo.entity.Fav;
import MJ.missingAnimalInfo.mapper.FavMapper;
import MJ.missingAnimalInfo.repository.FavRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class FavService {

  private final FavRepo favRepo;
  private final FavMapper favMapper;

  @Transactional
  public boolean checkSaveOrDelete(FavRequest favRequest){
    if(favRepo.findBySavedIdAndUserId(favRequest.getSavedId(),favRequest.getUserId()).isEmpty())
      return saveFav(favRequest);
    else return deleteFav(favRequest);
  }

  private boolean saveFav(FavRequest favRequest){
    try{
      favRepo.save(Fav.builder().savedId(favRequest.getSavedId())
          .userId(favRequest.getUserId())
          .type(favRequest.getType())
          .build());

      return true;
    } catch (Exception e){
      e.printStackTrace();
      return false;
    }
  }

  private boolean deleteFav(FavRequest favRequest){
    try{
      favRepo.deleteByUserIdAndSavedId(favRequest.getUserId(), favRequest.getSavedId());
      return true;
    }
    catch (Exception e){
      e.printStackTrace();
      return true;
    }
  }
}
