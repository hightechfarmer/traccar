package org.traccar.protocol;

import org.traccar.helper.TestDataManager;
import org.jboss.netty.buffer.ChannelBuffers;
import static org.traccar.helper.DecoderVerifier.verify;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.traccar.helper.ChannelBufferTools;

public class MeiligaoProtocolDecoderTest {

    @Test
    public void testDecode() throws Exception {

        MeiligaoProtocolDecoder decoder = new MeiligaoProtocolDecoder(null);
        decoder.setDataManager(new TestDataManager());

        assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(
                new int[]{0x24,0x24,0x00,0x00,0x12,0x34,0x56,0xFF,0xFF,0xFF,0xFF,0x50,0x00,0x8B,0x9B,0x0D,0x0A}))));

        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(
                new int[]{0x24,0x24,0x00,0x00,0x12,0x34,0x56,0xFF,0xFF,0xFF,0xFF,0x99,0x55,0x30,0x33,0x35,0x36,0x34,0x34,0x2E,0x30,0x30,0x30,0x2C,0x41,0x2C,0x32,0x32,0x33,0x32,0x2E,0x36,0x30,0x38,0x33,0x2C,0x4E,0x2C,0x31,0x31,0x34,0x30,0x34,0x2E,0x38,0x31,0x33,0x37,0x2C,0x45,0x2C,0x30,0x2E,0x30,0x30,0x2C,0x2C,0x30,0x31,0x30,0x38,0x30,0x39,0x2C,0x2C,0x2A,0x31,0x43,0x7C,0x31,0x31,0x2E,0x35,0x7C,0x31,0x39,0x34,0x7C,0x30,0x30,0x30,0x30,0x7C,0x30,0x30,0x30,0x30,0x2C,0x30,0x30,0x30,0x30,0x69,0x62,0x0D,0x0A}))));

        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(
                new int[]{0x24,0x24,0x00,0x00,0x33,0x58,0x01,0x97,0x03,0x58,0x1F,0x99,0x55,0x31,0x33,0x34,0x33,0x35,0x31,0x2E,0x30,0x30,0x30,0x2C,0x41,0x2C,0x30,0x39,0x32,0x35,0x2E,0x35,0x30,0x32,0x35,0x2C,0x4E,0x2C,0x30,0x36,0x39,0x31,0x34,0x2E,0x38,0x31,0x30,0x37,0x2C,0x57,0x2C,0x30,0x2E,0x30,0x30,0x2C,0x32,0x33,0x2C,0x33,0x30,0x31,0x30,0x31,0x32,0x2C,0x2C,0x2A,0x32,0x43,0x7C,0x30,0x2E,0x38,0x7C,0x31,0x38,0x36,0x7C,0x32,0x30,0x30,0x30,0x7C,0x30,0x31,0x32,0x36,0x2C,0x30,0x30,0x46,0x46,0x7C,0x30,0x32,0x44,0x45,0x30,0x30,0x30,0x32,0x44,0x38,0x43,0x44,0x42,0x34,0x31,0x35,0x7C,0x30,0x36,0x7C,0x30,0x30,0x46,0x44,0x36,0x42,0x37,0x39,0x95,0x82,0x0D,0x0A}))));

        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(
                new int[]{0x24,0x24,0x00,0x00,0x16,0x91,0x00,0x04,0x84,0x12,0x4F,0x99,0x55,0x31,0x34,0x30,0x36,0x30,0x33,0x2E,0x30,0x30,0x30,0x2C,0x41,0x2C,0x30,0x39,0x33,0x34,0x2E,0x32,0x35,0x35,0x34,0x2C,0x4E,0x2C,0x30,0x36,0x39,0x31,0x33,0x2E,0x30,0x39,0x36,0x36,0x2C,0x57,0x2C,0x30,0x2E,0x30,0x30,0x2C,0x2C,0x33,0x30,0x31,0x30,0x31,0x32,0x2C,0x2C,0x2A,0x30,0x32,0x7C,0x30,0x2E,0x38,0x7C,0x32,0x30,0x37,0x7C,0x30,0x30,0x30,0x30,0xFA,0x42,0x0D,0x0A}))));

        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(
                new int[]{0x24,0x24,0x00,0x00,0x45,0x12,0x42,0x20,0x30,0x6F,0xFF,0x99,0x99,0x14,0x31,0x35,0x35,0x34,0x32,0x32,0x2E,0x30,0x30,0x30,0x2C,0x56,0x2C,0x32,0x32,0x33,0x30,0x2E,0x37,0x36,0x32,0x33,0x2C,0x4E,0x2C,0x31,0x31,0x34,0x30,0x33,0x2E,0x34,0x32,0x31,0x38,0x2C,0x45,0x2C,0x30,0x2E,0x30,0x30,0x2C,0x30,0x2C,0x30,0x36,0x30,0x32,0x31,0x31,0x2C,0x2C,0x2A,0x31,0x41,0x7C,0x30,0x2E,0x30,0x7C,0x32,0x36,0x7C,0x30,0x30,0x30,0x30,0x7C,0x30,0x30,0x30,0x30,0x2C,0x30,0x30,0x30,0x30,0x7C,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x7C,0x36,0x33,0x7C,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0xBA,0xC1,0x0D,0x0A}))));

        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(
                new int[]{0x24,0x24,0x00,0x00,0x86,0x21,0x70,0x01,0x42,0x45,0x8F,0x99,0x99,0x50,0x31,0x39,0x32,0x39,0x35,0x38,0x2E,0x30,0x30,0x30,0x2C,0x41,0x2C,0x33,0x36,0x32,0x37,0x2E,0x31,0x36,0x39,0x39,0x2C,0x4E,0x2C,0x30,0x31,0x30,0x34,0x33,0x2E,0x35,0x36,0x32,0x37,0x2C,0x45,0x2C,0x30,0x2E,0x30,0x30,0x2C,0x32,0x33,0x39,0x2C,0x30,0x39,0x31,0x32,0x31,0x32,0x2C,0x2C,0x2A,0x30,0x46,0x7C,0x31,0x2E,0x30,0x7C,0x37,0x7C,0x30,0x30,0x30,0x30,0x7C,0x30,0x31,0x41,0x39,0x2C,0x30,0x31,0x39,0x37,0x7C,0x30,0x32,0x35,0x44,0x30,0x30,0x30,0x32,0x30,0x30,0x35,0x41,0x38,0x36,0x39,0x46,0x7C,0x31,0x32,0x7C,0x30,0x30,0x30,0x33,0x33,0x42,0x42,0x33,0xE2,0x48,0x0D,0x0A}))));

        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(
                new int[]{0x24,0x24,0x00,0x00,0x12,0x34,0x56,0x78,0x9F,0xFF,0xFF,0x99,0x55,0x30,0x32,0x30,0x36,0x30,0x30,0x2E,0x39,0x33,0x30,0x2C,0x41,0x2C,0x32,0x33,0x30,0x39,0x2E,0x32,0x30,0x35,0x31,0x2C,0x4E,0x2C,0x31,0x31,0x33,0x31,0x38,0x2E,0x38,0x34,0x34,0x39,0x2C,0x45,0x2C,0x30,0x2E,0x30,0x30,0x2C,0x30,0x2E,0x30,0x30,0x2C,0x30,0x39,0x30,0x37,0x31,0x30,0x2C,0x2C,0x2C,0x41,0x2A,0x36,0x41,0x7C,0x32,0x2E,0x36,0x7C,0x39,0x36,0x2E,0x37,0x7C,0x30,0x30,0x30,0x30,0x7C,0x30,0x30,0x30,0x30,0x2C,0x33,0x46,0x46,0x46,0x7C,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0xC4,0x52,0x0D,0x0A}))));
        
        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(
                new int[]{0x24,0x24,0x00,0x00,0x59,0x77,0x20,0x37,0x44,0x05,0x84,0x99,0x55,0x30,0x32,0x30,0x31,0x31,0x37,0x2E,0x30,0x30,0x30,0x2C,0x41,0x2C,0x34,0x31,0x31,0x37,0x2E,0x39,0x32,0x31,0x32,0x2C,0x4E,0x2C,0x30,0x38,0x31,0x33,0x30,0x2E,0x32,0x30,0x39,0x36,0x2C,0x57,0x2C,0x30,0x2E,0x30,0x30,0x2C,0x33,0x30,0x33,0x2E,0x38,0x35,0x2C,0x32,0x36,0x30,0x32,0x31,0x33,0x7C,0x31,0x2E,0x36,0x7C,0x30,0x30,0x7C,0x30,0x30,0x30,0x30,0x7C,0x30,0x30,0x30,0x30,0x2C,0x30,0x30,0x30,0x30,0x71,0xCD,0x0D,0x0A}))));

        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(
                new int[]{0x24,0x24,0x00,0x00,0x35,0x11,0x11,0x11,0x11,0x11,0x11,0x99,0x55,0x31,0x33,0x34,0x37,0x34,0x33,0x2e,0x30,0x30,0x33,0x2c,0x41,0x2c,0x30,0x36,0x34,0x38,0x2e,0x39,0x38,0x36,0x36,0x2c,0x53,0x2c,0x31,0x30,0x37,0x30,0x37,0x2e,0x35,0x37,0x39,0x35,0x2c,0x45,0x2c,0x30,0x30,0x30,0x2e,0x30,0x2c,0x30,0x30,0x30,0x2e,0x30,0x2c,0x32,0x36,0x30,0x33,0x31,0x33,0xf3,0x15,0x0d,0x0a}))));

        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(
                new int[]{0x24,0x24,0x00,0x00,0x00,0x91,0x80,0x03,0x69,0x76,0x41,0x99,0x55,0x30,0x38,0x35,0x31,0x33,0x30,0x2e,0x30,0x30,0x30,0x2c,0x41,0x2c,0x33,0x30,0x35,0x33,0x2e,0x31,0x36,0x34,0x35,0x2c,0x4e,0x2c,0x30,0x37,0x35,0x35,0x35,0x2e,0x37,0x34,0x37,0x36,0x2c,0x45,0x2c,0x30,0x2e,0x30,0x30,0x2c,0x32,0x37,0x2c,0x31,0x36,0x30,0x34,0x31,0x33,0x2c,0x2c,0x2a,0x33,0x46,0x7c,0x30,0x2e,0x38,0x7c,0x32,0x34,0x35,0x7c,0x32,0x30,0x30,0x30,0x7c,0x30,0x33,0x46,0x37,0x2c,0x30,0x30,0x30,0x30,0x2c,0x30,0x30,0x30,0x30,0x2c,0x30,0x30,0x31,0x42,0x2c,0x30,0x30,0x30,0x30,0x2c,0x30,0x30,0x30,0x30,0x2c,0x30,0x30,0x30,0x30,0x2c,0x30,0x30,0x30,0x30,0x7c,0x30,0x31,0x39,0x34,0x30,0x30,0x30,0x32,0x30,0x31,0x43,0x43,0x36,0x32,0x37,0x43,0x7c,0x31,0x41,0x7c,0x30,0x31,0x31,0x36,0x30,0x38,0x34,0x39,0xe6,0xa7,0x0d,0x0a}))));
        
        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(
                new int[]{0x24,0x24,0x00,0x00,0x26,0x01,0x61,0x00,0x90,0x1f,0xff,0x99,0x55,0x31,0x36,0x35,0x38,0x35,0x33,0x2c,0x41,0x2c,0x34,0x31,0x30,0x39,0x2e,0x36,0x30,0x32,0x31,0x32,0x2c,0x4e,0x2c,0x38,0x33,0x38,0x2e,0x35,0x39,0x31,0x31,0x39,0x2c,0x57,0x2c,0x33,0x2e,0x38,0x38,0x33,0x2c,0x31,0x32,0x2e,0x30,0x30,0x2c,0x30,0x34,0x30,0x37,0x31,0x33,0x2c,0x2c,0x2a,0x34,0x46,0x7c,0x32,0x2e,0x35,0x7c,0x31,0x31,0x30,0x7c,0x00,0x06,0x00,0x00,0x7c,0x00,0x00,0x01,0x0f,0x7c,0x30,0x32,0x42,0x30,0x2c,0x30,0x42,0x33,0x36,0x97,0x74,0x0d,0x0a}))));

        assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(
                new int[]{0x24,0x24,0x00,0x00,0x67,0x62,0x20,0x10,0x05,0x35,0x62,0xaa,0x00,0x00,0x01,0x00,0x01,0xae,0x4f,0x00,0x00,0x00,0x07,0x80,0x00,0x00,0x00,0x30,0x39,0x35,0x31,0x35,0x36,0x2e,0x30,0x30,0x30,0x2c,0x41,0x2c,0x32,0x36,0x32,0x33,0x2e,0x38,0x39,0x36,0x36,0x2c,0x4e,0x2c,0x30,0x35,0x30,0x30,0x35,0x2e,0x30,0x36,0x38,0x30,0x2c,0x45,0x2c,0x32,0x34,0x2e,0x35,0x2c,0x32,0x34,0x31,0x2e,0x30,0x2c,0x32,0x32,0x31,0x30,0x31,0x33,0x59,0x9c,0x0d,0x0a}))));

        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(
                new int[]{0x24,0x24,0x00,0x00,0x10,0x07,0xff,0xff,0xff,0xff,0xff,0x99,0x55,0x31,0x36,0x32,0x33,0x30,0x39,0x2e,0x30,0x35,0x34,0x2c,0x56,0x2c,0x30,0x39,0x33,0x31,0x2e,0x39,0x31,0x36,0x33,0x2c,0x4e,0x2c,0x30,0x36,0x39,0x31,0x31,0x2e,0x38,0x32,0x33,0x33,0x2c,0x57,0x2c,0x2c,0x2c,0x32,0x35,0x31,0x31,0x31,0x33,0x2c,0x2c,0x2c,0x4e,0x2a,0x36,0x43,0x7c,0x7c,0x31,0x35,0x38,0x7c,0x30,0x30,0x30,0x30,0x9c,0xc6,0x0d,0x0a}))));

        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(
                new int[]{0x24,0x24,0x00,0x00,0x35,0x63,0x07,0x04,0x35,0x65,0x20,0x99,0x55,0x30,0x35,0x32,0x30,0x34,0x32,0x2e,0x30,0x30,0x30,0x2c,0x41,0x2c,0x34,0x34,0x35,0x38,0x2e,0x33,0x35,0x36,0x35,0x2c,0x4e,0x2c,0x30,0x34,0x31,0x30,0x34,0x2e,0x34,0x38,0x31,0x33,0x2c,0x45,0x2c,0x30,0x2e,0x30,0x30,0x2c,0x30,0x2e,0x30,0x30,0x2c,0x31,0x39,0x30,0x31,0x31,0x34,0x2c,0x2c,0x2a,0x39,0x43,0x7c,0x30,0x2e,0x37,0x30,0x30,0x30,0x30,0x30,0x7c,0x2d,0x38,0x35,0x39,0x31,0x31,0x37,0x33,0x37,0x36,0x7c,0x30,0x31,0x30,0x30,0x7c,0x30,0x7c,0x7c,0x7c,0x4f,0x2a,0x0d,0x0a}))));
        
        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(
                new int[]{0x24,0x24,0x00,0x50,0x35,0x78,0x42,0x51,0xff,0xff,0xff,0x99,0x55,0x30,0x30,0x30,0x30,0x33,0x36,0x2e,0x39,0x38,0x31,0x2c,0x56,0x2c,0x30,0x39,0x33,0x31,0x2e,0x33,0x34,0x37,0x31,0x2c,0x4e,0x2c,0x30,0x36,0x39,0x31,0x31,0x2e,0x38,0x34,0x31,0x32,0x2c,0x57,0x2c,0x2c,0x2c,0x32,0x38,0x30,0x31,0x31,0x34,0x2c,0x2c,0x2c,0x4e,0x2a,0x36,0x35,0x7c,0x7c,0x31,0x36,0x38,0x7c,0x32,0x30,0x30,0x30,0x5e,0x42,0x0d,0x0a}))));

        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(
                new int[]{0x24,0x24,0x00,0x78,0x11,0x22,0x33,0x44,0xff,0xff,0xff,0x99,0x55,0x30,0x31,0x30,0x37,0x35,0x37,0x2e,0x30,0x30,0x30,0x2c,0x41,0x2c,0x32,0x39,0x35,0x39,0x2e,0x31,0x33,0x37,0x34,0x2c,0x4e,0x2c,0x30,0x39,0x35,0x34,0x30,0x2e,0x33,0x32,0x38,0x34,0x2c,0x57,0x2c,0x30,0x30,0x30,0x2e,0x30,0x2c,0x30,0x38,0x38,0x2e,0x37,0x2c,0x32,0x34,0x30,0x36,0x31,0x34,0x2c,0x2c,0x2c,0x41,0x2a,0x37,0x39,0x7c,0x31,0x2e,0x34,0x7c,0x33,0x35,0x2e,0x31,0x7c,0x30,0x30,0x30,0x30,0x7c,0x30,0x30,0x30,0x31,0x2c,0x30,0x30,0x30,0x30,0x7c,0x30,0x30,0x30,0x30,0x30,0x33,0x37,0x32,0x33,0x7c,0x30,0x30,0x30,0x30,0x30,0xe3,0x9f,0x0d,0x0a}))));

        //assertNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(
        //        new int[] {0x24,0x24,0x00,0x11,0x30,0x06,0x00,0x00,0x00,0x46,0x09,0x00,0x02,0x84,0x9a,0x0d,0x0a}))));
        
        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(
                new int[]{0x24,0x24,0x00,0x7f,0x35,0x68,0x96,0x03,0x06,0x76,0x01,0x99,0x55,0x31,0x31,0x30,0x39,0x32,0x34,0x2e,0x30,0x30,0x30,0x2c,0x41,0x2c,0x34,0x35,0x33,0x34,0x2e,0x32,0x35,0x38,0x35,0x2c,0x4e,0x2c,0x30,0x31,0x39,0x33,0x38,0x2e,0x36,0x35,0x31,0x34,0x2c,0x45,0x2c,0x30,0x2e,0x30,0x30,0x2c,0x2c,0x32,0x37,0x30,0x37,0x31,0x34,0x2c,0x2c,0x2c,0x41,0x2a,0x37,0x31,0x7c,0x31,0x2e,0x37,0x7c,0x31,0x30,0x30,0x7c,0x38,0x30,0x30,0x30,0x7c,0x30,0x37,0x37,0x42,0x2c,0x30,0x30,0x30,0x30,0x2c,0x30,0x30,0x30,0x30,0x2c,0x30,0x30,0x30,0x30,0x2c,0x30,0x30,0x30,0x30,0x2c,0x30,0x30,0x30,0x30,0x2c,0x30,0x30,0x30,0x30,0x2c,0x30,0x30,0x30,0x30,0x5d,0xfc,0x0d,0x0a}))));
        
    }

}
