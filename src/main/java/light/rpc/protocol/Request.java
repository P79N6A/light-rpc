package light.rpc.protocol;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * Rpc调用请求类
 */
@Data
public class Request {
    /**
     * 是否是异步调用
     */
    private boolean async;

    /**
     * 异步调用的请求id
     */
    private long asyncReqId;

    /**
     * 异步调用接收response的端口
     */
    private int asyncPort;

    /**
     * rpc调用类完整名
     */
    private String iface;

    /**
     * rpc调用方法名
     */
    private String method;

    /**
     * rpc调用的方法参数描述
     */
    private List<TypeValue> args;

    /**
     * 方法参数描述类
     */
    @Data
    @RequiredArgsConstructor
    public static class TypeValue {
        /**
         * 参数类型
         */
        private final String type;

        /**
         * 参数值的json串
         */
        private final String value;
    }
}
