package hello.hellospring.aop;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class TimeTraceAop {
    //hello.hellospring의 하위 package에 적용
//    @Around("execution(* hello.hellospring..*(..)")
//    public Object execute(ProceedJointPoint jointPoint) throws Throwable {
//        long start = System.currentTimeMillis();
//        System.out.println("START: " + jointPoint.toString);
//        try {
//            return jointPoint.proceed;
//        }finally {
//            long finish = System.currentTimeMillis();
//            long timeMs = finish - start;
//            System.out.println("END: " + jointPoint.toString() + " " + timeMs +"ms");
//        }
//    }
}
