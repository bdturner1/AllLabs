/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.web.servlet.mvc.SimpleFormController;


/**
 *
 * @author blake
 */
public class HelloController extends SimpleFormController {
    
    public HelloController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(Name.class);
        setCommandName("name");
        setSuccessView("helloView");
        setFormView("nameView");
    }
    
    @Override
    /*protected void doSubmitAction(Object command) throws Exception {
        throw new UnsupportedOperationException("Not yet implemented");
    }*/

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
   
    @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request,
            HttpServletResponse response,
            Object command,
            BindException errors) throws Exception {

        Name name = (Name) command;
        ModelAndView mv = new ModelAndView(getSuccessView());
        mv.addObject("helloMessage", helloService.sayHello(name.getValue()));
        return mv;
}
     
}
