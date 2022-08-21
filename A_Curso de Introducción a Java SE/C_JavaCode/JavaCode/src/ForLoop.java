public class ForLoop {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String days[] = new String[17];

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        for (int i = 0; i < androidVersions.length; i++) {
            if (androidVersions[i] == null){
                continue;
            }
            System.out.println(androidVersions[i]);
        }

        for (String androidVersion: androidVersions) {
            if (androidVersion == null){
                continue;
            }
            System.out.println(androidVersion);
        }
    }
}
