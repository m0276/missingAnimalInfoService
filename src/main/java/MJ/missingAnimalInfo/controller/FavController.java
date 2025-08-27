package MJ.missingAnimalInfo.controller;

import MJ.missingAnimalInfo.dto.FavDto;
import MJ.missingAnimalInfo.dto.request.FavRequest;
import MJ.missingAnimalInfo.service.FavService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/fav")
public class FavController {

  private final FavService favService;

  @GetMapping
  public ResponseEntity<List<FavDto>> getFav(){
    return ResponseEntity.ok(favService.getFavLists());
  }

  @PostMapping
  public ResponseEntity<Boolean> saveOrDelete(@RequestBody FavRequest favRequest){
    return ResponseEntity.ok(favService.checkSaveOrDelete(favRequest));
  }
}
