package org.openmrs.module.dashboardtab.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: tika
 * Date: 11/28/13
 * Time: 10:54 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("**/dashboardtabforid.portlet")
public class DashboardTabForIDController  {

    // protected final Log log = LogFactory.getLog(getClass());
    protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
                                    BindException errors) throws Exception {
        final Log log = LogFactory.getLog(getClass());
        System.out.println("you came to the new page !!!");
        //direct to the relevant patient dashboard
        return new ModelAndView("");
    }

    protected Object formBackingObject(HttpServletRequest request) throws Exception {
        final Log log = LogFactory.getLog(getClass());
        String text = "Not used";
        log.debug("Returning hello world text: " + text);
        return text;
    }

    protected Map referenceData(HttpServletRequest req) throws Exception {

        Map<String,Object> modelMap=new HashMap<String,Object>();

        return modelMap;
    }
}
