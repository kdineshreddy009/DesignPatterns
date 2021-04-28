package com.practice.behavioral.command;

public class StereoOnWithCDCommand implements Command
{
    StereoMusic stereo;
    public StereoOnWithCDCommand(StereoMusic stereo)
    {
        this.stereo = stereo;
    }
    public void execute()
    {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
