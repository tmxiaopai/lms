package com.tmxf.lms.controller;

import com.tmxf.lms.entity.Project;
import com.tmxf.lms.entity.Visit;
import com.tmxf.lms.service.ProjectService;
import com.tmxf.lms.service.VisitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * The type Visit plan controller.
 *
 * @author TMXIAOPAI
 * @date 2020 /4/16 - 17:32
 * @package_name com.tmxf.lms.controller
 */
@RestController
public class VisitPlanController {
    /**
     * The Logger.
     */
    Logger logger= LoggerFactory.getLogger(getClass());
    @Resource
    private VisitService visitService;
    @Resource
    private ProjectService projectService;

    /**
     * Insert plan object.
     *
     * @param visit   the visit
     * @param request the request
     * @return the object
     */
    @PostMapping("insertPlan")
    public Object insertPlan(@RequestBody Visit visit, HttpServletRequest request)
    {
        visit.setSendMan((String) request.getSession().getAttribute("userName"));
        return visitService.insert(visit);
    }

    /**
     * Update plan int.
     *
     * @param visit the visit
     * @return the int
     */
    @PostMapping("updatePlan")
    public int updatePlan(@RequestBody Visit visit)
    {
        Project project=new Project();
        project.setProjectNum(visit.getPNum());
        project.setProjectStatus(visit.getDegree());
        projectService.update(project);
        return visitService.update(visit);
    }

    /**
     * Delete plan int.
     *
     * @param planId the plan id
     * @return the int
     */
    @PostMapping("deletePlan")
    public int deletePlan(@RequestBody Integer planId){
        return visitService.deleteById(planId);
    }

    /**
     * Find all plan object.
     *
     * @return the object
     */
    @PostMapping("findAllPlan")
    public Object findAllPlan(){
        return visitService.findAllPlan();
    }
}
