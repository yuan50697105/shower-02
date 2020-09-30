package com.idea.shower.commons.storage;

import com.aliyun.oss.OSSClient;
import org.minbox.framework.api.boot.oss.ApiBootOssService;

import java.io.InputStream;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-09-30 09:54
 */
public class CommonsOssService extends ApiBootOssService {
    /**
     * Initialize global variables using constructor
     *
     * @param endpoint        {@link #endpoint}
     * @param bucketName      {@link #bucketName}
     * @param accessKeyId     {@link #accessKeyId}
     * @param accessKeySecret {@link #accessKeySecret}
     * @param domain          {@link #domain}
     */
    public CommonsOssService(String endpoint, String bucketName, String accessKeyId, String accessKeySecret, String domain) {
        super(endpoint, bucketName, accessKeyId, accessKeySecret, domain);
    }

    public InputStream downloadFile(String objectName) {
        OSSClient ossClient = getOssClient();
        InputStream inputStream = ossClient.getObject(bucketName, objectName).getObjectContent();
        closeOssClient(ossClient);
        return inputStream;
    }
}