package com.Ugam.PlatformServer.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDBConfig {

    public static final String SERVICE_ENDPOINT="dynamodb.ap-south-1.amazonaws.com";
    public static final  String Region ="us-east-2";
    public static final  String AcessKey="AKIA5I3ARKIEY37NRXE2";
    public static final  String SecretKey="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";

    @Bean
    public DynamoDBMapper mapper() {
        return new DynamoDBMapper(amazonDynamDBConfig());
    }

    private AmazonDynamoDB amazonDynamDBConfig() {
        return AmazonDynamoDBClientBuilder.standard().withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(SERVICE_ENDPOINT,Region))
                .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(AcessKey, SecretKey))).build();
    }
}
