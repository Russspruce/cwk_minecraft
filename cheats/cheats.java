public class Player extends BasePlayer {
  public void onChat( String message ) {

    if (message.equals("attack")) {

          throwProjectile(ProjectileType.ARROW);

    }

    if (message.equals("creative")) {

          setGameMode(GameMode.CREATIVE);

    }

    if (message.equals("survival")) {

          setGameMode(GameMode.SURVIVAL);

    }

    if (message.equals("day")) {

          world.setTime(1000);
}

    if (message.equals("night")) {

      world.setTime(13000);
}
  }
}
