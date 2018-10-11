package proxy;

import java.math.BigDecimal;

/**
 * @author 谢仲东 2018-10-11 14:31
 */
public class ProxyImpl {
    public static void main(String[] args) {
        /*
        Player player = new Player();
        player.login("Tony", "abu9Iks0");
        player.killMaster();
        player.killMaster();
        player.killMaster();
        player.killMaster();
        player.killMaster();
        */
        Player moneyPlayer = new Player();
        PlayerProxy proxy = new PlayerProxy(moneyPlayer);
        proxy.login("Nick", "abu9Iks0");
        for (int a = 0; a < 230; a++) {
            proxy.killMaster();
            if (a % 8 == 2) {
                proxy.pickEquipment();
            }
        }
        proxy.clearing();
    }
}
interface IPlayer {
    void login(String username, String password);
    void pickEquipment();
    boolean killMaster();
}
class PlayerProxy implements IPlayer {
    private IPlayer player;
    private static BigDecimal totalFee = BigDecimal.ZERO;
    private static final BigDecimal PRICE_PER_LEVEL = new BigDecimal(9.9);
    PlayerProxy(Player player) {
        this.player = player;
    }

    @Override
    public void login(String username, String password) {
        player.login(username, password);
    }

    @Override
    public void pickEquipment() {
        player.pickEquipment();
    }

    @Override
    public boolean killMaster() {
        if (player.killMaster()) {
            totalFee = totalFee.add(PRICE_PER_LEVEL);
        }
        return true;
    }

    public void clearing() {
        System.out.printf("[Success] 清算代练收入：%.2f", totalFee.doubleValue());
    }
}
class Player implements IPlayer{
    private String username;
    private Integer experience = 0;
    private Integer level = 1;
    @Override
    public void login(String username, String password) {
        this.username = username;
        System.out.printf("[Success] %s@%s 登录\n", username, password);
    }

    @Override
    public void pickEquipment() {
        if ("".equals(username) || username == null) {
            System.out.println("[Error]请先登录");
            return;
        }
        System.out.printf("[Success] %s 捡起一件装备\n", username);
    }

    @Override
    public boolean killMaster() {
        if ("".equals(username) || username == null) {
            System.out.println("[Error]请先登录");
            return false;
        }
        System.out.printf("[Success] %s 刷了一个怪, 当前经验值为 %d\n", username, experience);
        if (++ this.experience == 3) {
            upgrade();
            return true;
        }
        return false;
    }

    private void upgrade() {
        if ("".equals(username) || username == null) {
            System.out.println("[Error]请先登录");
            return;
        }
        this.level++;
        this.experience = 0;
        System.out.printf("[Success] %s 升级, 当前等级为%d, (*^▽^*)~~~\n", username, level);
    }
}