/**
 * @Project:
 * @Author: leegoo
 * @Date: 2023年03月15日
 */
package cn.withmes.netty.encodeDecode.lengthFieldBasedFrame;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.slf4j.LoggerFactory;

/**
 * ClassName: NettyServerStringPrintDecoder
 *
 * @author leegoo
 * @Description:
 * @date 2023年03月15日
 */
public class NettyServerPrintDecoder extends ChannelInboundHandlerAdapter {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(NettyServerPrintDecoder.class);

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        String mes = (String) msg;
        log.info("[NettyServerStringPrintDecoder] -> 接收到的数据:{}",mes);
        //super.channelRead(ctx,msg);
    }
}
