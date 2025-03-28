package model.gamePhases;

import controller.MenuController;
import model.abstractClasses.GameController;
import model.abstractClasses.GamePhase;
import utils.GameEngine;

/**
 * The type Initial phase.
 */
public class InitialPhase extends GamePhase {

    public InitialPhase(GameEngine p_GameEngine) {
        super(p_GameEngine);
    }

    @Override
    public GameController getController() {
        return new MenuController(this.d_GameEngine);
    }
}
