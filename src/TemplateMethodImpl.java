/**
 * @author 谢仲东 2018/8/8 22:09
 * Description:
 */
public class TemplateMethodImpl {

    public static void main(String[] args) {
        GameComputer gc = new GameComputer();
        WorkComputer wc = new WorkComputer();

        System.out.println("====== 游戏主机启动 =====");
        gc.startup();
        System.out.println("====== 办公主机启动 =====");
        wc.startup();

        /*
            output:
            ====== 游戏主机启动 =====
            游戏主机电源通电，电压300W
            游戏主机主板通电，启动水冷设备
            游戏主机CPU通电，标频2.2Hz，睿频4.4Hz
            游戏主机CPU通电，独立显卡，显存6G
            ====== 办公主机启动 =====
            办公主机电源通电，电压150W
            办公主机主板通电，启动15w散热风扇
            办公主机CPU通电，标频1.8Hz，睿频3.8Hz
            办公主机CPU通电，集成显卡，显存1G
            抽象类中的powerOn() motherboardStartup() CPUStartup() GPUStartup() 为基础方法，有实现类实现其内部逻辑
            抽象类中的startup方法为模板方法，负责调度基础方法的执行逻辑
         */
    }
}


abstract class AbstractComputer{

    //接通电源
    abstract protected void powerOn();
    //主板启动
    abstract protected void motherboardStartup();
    //CPU启动
    abstract protected void CPUStartup();
    //GPU启动
    abstract protected void GPUStartup();

    //启动主机
    public final void startup() {
        this.powerOn();
        this.motherboardStartup();
        this.CPUStartup();
        this.GPUStartup();
    }
}

class GameComputer extends AbstractComputer{

    @Override
    protected void powerOn() {
        System.out.println("游戏主机电源通电，电压300W");
    }

    @Override
    protected void motherboardStartup() {
        System.out.println("游戏主机主板通电，启动水冷设备");
    }

    @Override
    protected void CPUStartup() {
        System.out.println("游戏主机CPU通电，标频2.2Hz，睿频4.4Hz");
    }

    @Override
    protected void GPUStartup() {
        System.out.println("游戏主机CPU通电，独立显卡，显存6G");
    }
}

class WorkComputer extends AbstractComputer{

    @Override
    protected void powerOn() {
        System.out.println("办公主机电源通电，电压150W");
    }

    @Override
    protected void motherboardStartup() {
        System.out.println("办公主机主板通电，启动15w散热风扇");
    }

    @Override
    protected void CPUStartup() {
        System.out.println("办公主机CPU通电，标频1.8Hz，睿频3.8Hz");
    }

    @Override
    protected void GPUStartup() {
        System.out.println("办公主机CPU通电，集成显卡，显存1G");
    }
}
