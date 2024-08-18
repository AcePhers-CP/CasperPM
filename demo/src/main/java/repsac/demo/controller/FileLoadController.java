package repsac.demo.controller;

import com.amazonaws.services.s3.AmazonS3;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FileLoadController {

    private final AmazonS3 s3;  // AmazonS3 인터페이스로 변경

    @Value("${cloud.aws.s3.bucket}") // lombok의 @Value가 아니라 Spring의 @Value를 사용
    private String bucketName;

    public String getPath(String path) {
        // bucketName을 사용하도록 수정
        String url = s3.getUrl(bucketName, path).toString();
        System.out.println(url);
        return url;
    }
}
