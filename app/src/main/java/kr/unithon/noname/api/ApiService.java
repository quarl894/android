package kr.unithon.noname.api;

import java.util.ArrayList;

import io.reactivex.Single;
import kr.unithon.noname.model.Crop;
import kr.unithon.noname.model.RecommendGroup;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {
    // 추천 작물 조회 API
    Single<ArrayList<RecommendGroup>> getRecommendCropList();

    // 내 작물 조회 API
    Single<ArrayList<Crop>> getMyCropList(String userId);

    // 작물 상세 API
    Single<Crop> getCropDetail(String cropId);

}
