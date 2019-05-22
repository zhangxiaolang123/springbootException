package com.zxl;

import org.springframework.web.bind.annotation.*;

@ControllerAdvice
@ResponseBody
public class RestExceptionHandler
{
    /**
     * 运行时异常处理方法
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus
    public ApiResult runtimeExceptionHandler(RuntimeException e) {
        System.out.println("运行时异常");
        return ApiResultGenerator.errorResult(e.getMessage(),e);
    }

    /**
     * 业务统一异常处理方法
     * @param e 默认Exception异常对象
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    @ResponseStatus
    public ApiResult businessException (BusinessException e) {
        System.out.println("业务异常"+e.getMessage());
        return ApiResultGenerator.errorResult(e.getMessage(),e);
    }
}
