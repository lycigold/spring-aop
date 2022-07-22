package hello.aop.order.aop;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {
    //포인트컷을 여러 어드바이스에서 함께 사용할때 효과적인 사용예 AspectV4Pointcut

    //hello.aop.order 패키지와 하위 패키지
    @Pointcut("execution(* hello.aop.order..*(..))")
    public void allOrder() {}

    //타입 패턴이 * Service
    @Pointcut("execution(* *..*Service.*(..))")
    public void allService() {}

    //allOrder && allService
    @Pointcut("allOrder() && allService()")
    public void orderAndService(){}

}
