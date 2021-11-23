public class MyClass {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        RobotConnection rc = null;

         for (int i = 1; i <= 3; i++) {
            try {
                rc = robotConnectionManager.getConnection();
                rc.moveRobotTo(toX, toY);
                rc.close();
                break;
            } catch (RobotConnectionException e) {
                if (i == 3) {
                    rc.close();
                    throw e;
                }
            } catch (Exception e) {
                rc.close();
                throw e;
                break;
            } finally {
                rc.close();
            }
        }
    }
}