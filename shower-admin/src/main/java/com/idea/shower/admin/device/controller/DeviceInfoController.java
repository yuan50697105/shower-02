package com.idea.shower.admin.device.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import cn.hutool.extra.servlet.ServletUtil;
import com.idea.shower.admin.device.pojo.DeviceInfoVo;
import com.idea.shower.admin.device.service.DeviceInfoService;
import com.idea.shower.db.mybaits.module.pojo.query.DeviceInfoQuery;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-08-02 16:56
 */
@RestController
@RequestMapping("/device/info")
@AllArgsConstructor
@Slf4j
public class DeviceInfoController {

    private final DeviceInfoService deviceInfoService;

    @PostMapping("upload/picture")
    public Result<?> uploadPicture(MultipartFile file) {
        return deviceInfoService.uploadPicture(file);
    }

    @PostMapping({"", "/save"})
    public Result<?> add(@RequestBody DeviceInfoVo deviceInfoVo) {
        return deviceInfoService.add(deviceInfoVo);
    }

    @PutMapping({"", "/modify"})
    public Result<?> modify(@RequestBody DeviceInfoVo deviceInfoVo) {
        return deviceInfoService.modify(deviceInfoVo);
    }

    @DeleteMapping({"/{id}"})
    public Result<?> delete(@PathVariable Long id) {
        return deviceInfoService.delete(id);
    }


    @DeleteMapping(value = {""})
    public Result<?> delete(@RequestBody List<Long> id) {
        return deviceInfoService.delete(id);
    }

    @GetMapping({"/{id}", "/get/{id}"})
    public Result<?> get(@PathVariable Long id) {
        return ResultInfo.success(deviceInfoService.getById(id));
    }

    @GetMapping({"/data"})
    public Result<?> data(DeviceInfoQuery query) {
        return deviceInfoService.data(query);
    }

    @GetMapping("list")
    public Result<?> list(DeviceInfoQuery query) {
        return deviceInfoService.list(query);
    }

    @PostMapping("QRCode")
    public Result<?> QRCode(@RequestBody DeviceInfoVo deviceInfoVo) {
        return deviceInfoService.QRCode(deviceInfoVo);
    }

    @SneakyThrows
    @GetMapping("/{id}/picture")
    public void downPicture(@PathVariable("id") Long id, HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map = deviceInfoService.downQrCode(id);
        Path fileName = Paths.get((String) map.get("fileName"));
        String contentType = Files.probeContentType(fileName);
        ServletUtil.write(response, (InputStream) map.get("stream"), contentType, fileName.getFileName().toFile().getName());
    }
}