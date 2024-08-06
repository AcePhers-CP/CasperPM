package CASPER.S3.controller;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FileLoadController {

    private final AmazonS3Client s3;

    @Value("${cloud.aws.s3.bucket}") //lombok value 아님
    private String bucketName;

    public String getPath(String path){
        String url = s3.getUrl("repsac",path).toString();
        System.out.println(url);
        return url;
    }
}
