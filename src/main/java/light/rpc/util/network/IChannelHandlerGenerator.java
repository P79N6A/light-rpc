package light.rpc.util.network;

import io.netty.channel.ChannelHandler;

import java.util.List;

/**
 * Created by boying on 17/2/27.
 */
public interface IChannelHandlerGenerator {
    List<ChannelHandler> gen();
}
