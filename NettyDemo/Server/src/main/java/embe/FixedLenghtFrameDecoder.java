package embe;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * Created by Nlte on 2017/07/21 16:54.
 */
public class FixedLenghtFrameDecoder extends ByteToMessageDecoder {
    private final int frameLenght;

    public FixedLenghtFrameDecoder(int frameLenght) {
        if (frameLenght <= 0){
            throw new IllegalArgumentException("error");
        }
        this.frameLenght = frameLenght;
    }

    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        while (in.readableBytes() >= frameLenght){
            ByteBuf buf = in.readBytes(frameLenght);
            out.add(buf);
        }
    }
}
