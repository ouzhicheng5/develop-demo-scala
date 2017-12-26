package cn.demo.controller.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * jwt验证拦截器
 */
public class JwtInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }

    /* private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    MenuService menuService;

    @Override
    //action 执行之前验证token
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        String uri =request.getServletPath();
        uri = uri.endsWith("/") ? uri.substring(0,uri.length()-1) : uri;
        try{
            ResultVo<LoginSuccessVo> result=RequestUtil.getUserInfo(request);
            if(result.getErrorCode() !=0 ){
                PrintWriter printWriter = response.getWriter();
                printWriter.write(JSONUtil.toJsonString(result));
                return false;
            }
            LoginSuccessVo userInfo=result.getData();
*//*            if(!hasAccess(userInfo,uri)){
                PrintWriter printWriter = response.getWriter();
                printWriter.write(JSONUtil.toJsonString(new ResultVo<>(HttpStatus.FORBIDDEN.value())));
                return false;
            }*//*
            return true;
        }catch (Exception e){
            PrintWriter printWriter = response.getWriter();
            printWriter.write(JSONUtil.toJsonString(new ResultVo<>(ErrorCode.UnknownError.getErrorCode())));
            logger.error(e.getMessage(),e);
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        //action执行之后,生产视图之前
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        //最后执行
    }

    private   boolean hasAccess(LoginSuccessVo userInfo,String url){
        Set<BigDecimal> roleIdSet=userInfo.getRoleIds();
        if(roleIdSet==null||roleIdSet.isEmpty()){
            return false;
        }
        if(RequestUtil.isAdmin(userInfo)){
            return true;
        }
       Map<String,BigDecimal> menuUrlIdMap=menuService.findEffectiveMenus();
        if(!menuUrlIdMap.containsKey(url)){
            return true;
        }
        BigDecimal menuId=menuUrlIdMap.get(url);
       List<BigDecimal>  menuRoleIdList =menuService.findRolesByMenuId(menuId);
       return  !CollectionUtil.intersection(roleIdSet,menuRoleIdList).isEmpty();
    }
*/
}
