package com.practice.behavioral.command;

class StereoOffCommand implements Command
{
    StereoMusic stereo;
    public StereoOffCommand(StereoMusic stereo)
    {
        this.stereo = stereo;
    }
    public void execute()
    {
        stereo.off();
    }
}
