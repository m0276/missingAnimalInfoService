package MJ.missingAnimalInfo.service;

import MJ.missingAnimalInfo.repository.FavRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FavService {

  private final FavRepo favRepo;

}
