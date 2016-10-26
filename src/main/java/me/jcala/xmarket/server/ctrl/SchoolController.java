package me.jcala.xmarket.server.ctrl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.jcala.xmarket.server.entity.dto.Result;
import me.jcala.xmarket.server.admin.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 与学校相关的控制器
 */
@Api("跟学校有关的api")
@RestController
@RequestMapping("/api/school")
public class SchoolController {
    private SystemService schoolService;

    @Autowired
    public SchoolController(SystemService schoolService) {
        this.schoolService = schoolService;
    }

    @ApiOperation("获取学校名称列表")
    @GetMapping(value = "/names",produces = "application/json;charset=UTF-8")
    public Result<List<String>> getSchoolNameList() throws RuntimeException{
        return schoolService.gainSchoolNameList();
    }
}