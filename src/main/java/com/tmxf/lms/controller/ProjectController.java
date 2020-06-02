package com.tmxf.lms.controller;

import com.alibaba.fastjson.JSONObject;
import com.tmxf.lms.entity.Project;
import com.tmxf.lms.service.ProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * The type Project controller.
 *
 * @author TMXIAOPAI
 * @date 2020 /4/15 - 16:22
 * @package_name com.tmxf.lms.controller
 */
@RestController
public class ProjectController {
    /**
     * The Logger.
     */
    Logger logger= LoggerFactory.getLogger(getClass());
    @Resource
    private ProjectService projectService;

    /**
     * Insert project string.
     *
     * @param project the project
     * @param request the request
     * @return the string
     */
    @PostMapping("insertProject")
    public String insertProject(@RequestBody Project project, HttpServletRequest request){
        logger.info("开始进行项目保存逻辑");
        logger.info("传输的数据为:"+project.toString());
        String salesman= (String) request.getSession().getAttribute("userName");
        logger.info("session中或取得用户名为："+salesman);
        project.setSalesman(salesman);
        project.setProjectDesignDate(new Date());
        project.setProjectStatus("初步沟通");
        logger.info("修改后的数据为:"+project.toString());
        if(projectService.insert(project)!=null){
            return "项目保存成功";
        }
        return "项目保存失败";
    }

    /**
     * Find all project object.
     *
     * @return the object
     */
    @GetMapping("findAllProject")
    public Object findAllProject(){
        logger.info("开始项目查找逻辑");
        return JSONObject.toJSONString(projectService.queryAll());
    }

    /**
     * Uodate project string.
     *
     * @param project the project
     * @return the string
     */
    @PostMapping("updateProject")
    public String UodateProject(@RequestBody Project project){
        if(projectService.update(project)==1){
            return "修改成功";
        }
        return "修改失败";
    }

    /**
     * Delete project int.
     *
     * @param projectNum the project num
     * @return the int
     */
    @PostMapping("deleteProject")
    public int deleteProject(@RequestBody String projectNum){
        return projectService.deleteById(projectNum);
    }

    /**
     * Name ok int.
     *
     * @param projectName the project name
     * @return the int
     */
    @PostMapping("nameOk")
    public int nameOk(@RequestBody String projectName){
        return projectService.projectNameOk(projectName);
    }

    /**
     * Find all project name object.
     *
     * @return the object
     */
    @GetMapping("findAllProjectName")
    public Object findAllProjectName(){
        return projectService.findAllProjectName();
    }

    /**
     * Search project string.
     *
     * @param project the project
     * @return the string
     */
    @PostMapping("searchProject")
    public String searchProject(@RequestBody Project project){
        return JSONObject.toJSONString(projectService.queryAllByProject(project));
    }
}
