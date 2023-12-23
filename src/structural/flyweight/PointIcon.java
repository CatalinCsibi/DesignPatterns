package structural.flyweight;

public class PointIcon {

    private final PointType type;
    private final byte[] icon; // 20 KB -> 20 MB

    public PointIcon(PointType type, byte[] icon) {
        this.type = type;
        this.icon = icon;
    }

    public PointType getType() {
        return type;
    }
}
