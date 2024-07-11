package io.github.imecuadorian.logicgame.controller;

import io.github.imecuadorian.logicgame.managers.PlayerManager;
import io.github.imecuadorian.logicgame.model.Player;
import io.github.imecuadorian.logicgame.services.PlayerService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class PlayerController {

	private final PlayerService playerService;

	public Player save(Player player) {return playerService.save(player);}//create

	public List<Player> getAllPlayers() { return playerService.getAll(); }//read

	public Player get(Integer id){return playerService.get(id);}//read

	public void delete(Integer id){playerService.delete(id);}//delete

	public int getsize(){return getAllPlayers().size();}



}
