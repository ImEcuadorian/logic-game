/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this
 * license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package io.github.imecuadorian.logicgame.views;

import io.github.imecuadorian.logicgame.controller.DeductiveQuestionController;
import io.github.imecuadorian.logicgame.helpers.ShuffleQuestion;
import io.github.imecuadorian.logicgame.model.DeductiveQuestion;
import io.github.imecuadorian.logicgame.model.Player;
import io.github.imecuadorian.logicgame.model.Score;
import io.github.imecuadorian.logicgame.model.Time;
import io.github.imecuadorian.logicgame.services.DeductiveQuestionService;
import io.github.imecuadorian.logicgame.services.PlayerService;
import io.github.imecuadorian.logicgame.services.ScoreService;
import io.github.imecuadorian.logicgame.services.ScoreServiceImpl;

import javax.swing.*;
import java.util.List;

/**
 * @author Hugo Saldarriaga
 */
public class QuestionView
	extends javax.swing.JDialog {

	/**
	 * Creates new form QuestionView
	 */
	private final DeductiveQuestionController deductiveQuestionController;
	private final PlayerService playerService;

	private final ScoreService scoreService;
	private final Player player;
	private final List<DeductiveQuestion> questions;
	private final int maxQuestions;

	private int points = 0;

	public QuestionView(
		java.awt.Frame parent,
		boolean modal,
		DeductiveQuestionService deductiveQuestionService,
		PlayerService playerService,
		Player player,
		ScoreService scoreService
	) {
		super(parent, modal);
		initComponents();
		this.deductiveQuestionController =
			new DeductiveQuestionController(deductiveQuestionService);
		this.questions = (List<DeductiveQuestion>) ShuffleQuestion.shuffleQuestions(
			deductiveQuestionController.getAll());
		this.maxQuestions = deductiveQuestionController.getSize();
		this.playerService = playerService;
		this.player = player;
		this.scoreService = scoreService;
		pointsLabel.setText("Points: " + points);
		if (maxQuestions == 0) {
			JOptionPane.showMessageDialog(this, "There are no questions available");
			this.dispose();
		} else {
			loadQuestion();
		}
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT
	 * modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        secondPremiseLabel = new javax.swing.JLabel();
        thirdPremiseLabel = new javax.swing.JLabel();
        firstPremiseLabel = new javax.swing.JLabel();
        firstOptionRadioButton = new javax.swing.JRadioButton();
        secondOptionRadioButton = new javax.swing.JRadioButton();
        thirdOptionRadioButton = new javax.swing.JRadioButton();
        nextQuestionButton = new javax.swing.JButton();
        pointsLabel = new javax.swing.JLabel();
        liveLabel4 = new javax.swing.JLabel();
        liveLabel2 = new javax.swing.JLabel();
        liveLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        secondPremiseLabel.setText("jLabel1");

        thirdPremiseLabel.setText("jLabel1");

        firstPremiseLabel.setText("jLabel1");

        buttonGroup1.add(firstOptionRadioButton);
        firstOptionRadioButton.setText("jRadioButton1");

        buttonGroup1.add(secondOptionRadioButton);
        secondOptionRadioButton.setText("jRadioButton2");

        buttonGroup1.add(thirdOptionRadioButton);
        thirdOptionRadioButton.setText("jRadioButton3");

        nextQuestionButton.setText("Siguiente");
        nextQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextQuestionButtonActionPerformed(evt);
            }
        });

        pointsLabel.setText("Puntos:");

        liveLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hearth_icon_50px.png"))); // NOI18N

        liveLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hearth_icon_50px.png"))); // NOI18N

        liveLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hearth_icon_50px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nextQuestionButton)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(liveLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(liveLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(liveLabel3)
                        .addGap(38, 38, 38))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secondPremiseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(thirdPremiseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(thirdOptionRadioButton)
                                    .addComponent(secondOptionRadioButton)
                                    .addComponent(firstOptionRadioButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pointsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(firstPremiseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(pointsLabel)
                .addGap(76, 76, 76)
                .addComponent(secondPremiseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thirdPremiseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(liveLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(liveLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(liveLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(firstOptionRadioButton)
                .addGap(40, 40, 40)
                .addComponent(secondOptionRadioButton)
                .addGap(51, 51, 51)
                .addComponent(thirdOptionRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(nextQuestionButton)
                .addGap(53, 53, 53))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(firstPremiseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(501, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

	private void nextQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST
		// :event_nextQuestionButtonActionPerformed
		if (!firstOptionRadioButton.isSelected() && !secondOptionRadioButton.isSelected() &&
		    !thirdOptionRadioButton.isSelected()) {
			JOptionPane.showMessageDialog(this, "Please select an option");
			return;
		}

		String selectedOption = "";
		if (firstOptionRadioButton.isSelected()) {
			selectedOption = firstOptionRadioButton.getText();
		} else if (secondOptionRadioButton.isSelected()) {
			selectedOption = secondOptionRadioButton.getText();
		} else {
			selectedOption = thirdOptionRadioButton.getText();
		}
		DeductiveQuestion question = questions.getFirst();

		if (question.getCorrectOption()
			    .equals(selectedOption)) {
			resetOptions();
			points++;
			pointsLabel.setText("Points: " + points);
		} else {
			resetOptions();
			player.reduceLife();
			if (player.getLIFE() == 2) {
				liveLabel4.setVisible(false);
			} else if (player.getLIFE() == 1) {
				liveLabel3.setVisible(false);
			} else {
				liveLabel2.setVisible(false);
			}
			if (!checkHasLives()) {
				JOptionPane.showMessageDialog(this, "Game Over");
				JOptionPane.showMessageDialog(this, "Points: " + points);
				this.dispose();
				Score score = new Score();
				score.setPlayerId(player.getId());
				score.setTypeGameId(1);
				score.setScore(points);
				((ScoreServiceImpl) scoreService).update(player, points);
			}
		}

		questions.removeFirst();
		if (questions.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Game Over");
			JOptionPane.showMessageDialog(this, "Points: " + points);
			this.dispose();
			Score score = new Score();
			score.setPlayerId(player.getId());
			score.setTypeGameId(1);
			score.setScore(points);
			((ScoreServiceImpl) scoreService).update(player, points);
		} else {
			resetOptions();
			loadQuestion();
		}
	}

	private DeductiveQuestion loadQuestion() {
		resetOptions();
		DeductiveQuestion question = questions.getFirst();
		firstPremiseLabel.setText(question.getFirstPremise());
		secondPremiseLabel.setText(question.getSecondPremise());
		thirdPremiseLabel.setText(question.getConclusion());
		String[] options = ShuffleQuestion.shuffleOptions(question.getOptions())
			                   .split(",");
		for (int i = 0; i < options.length; i++) {
			switch (i) {
				case 0:
					firstOptionRadioButton.setText(options[i]);
					break;
				case 1:
					secondOptionRadioButton.setText(options[i]);
					break;
				case 2:
					thirdOptionRadioButton.setText(options[i]);
					break;
			}
		}


		return question;
	}

	private void resetOptions() {
		buttonGroup1.clearSelection();
	}

	private boolean checkHasLives() {
		return player.getLIFE() > 0;
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton firstOptionRadioButton;
    private javax.swing.JLabel firstPremiseLabel;
    private javax.swing.JLabel liveLabel2;
    private javax.swing.JLabel liveLabel3;
    private javax.swing.JLabel liveLabel4;
    private javax.swing.JButton nextQuestionButton;
    private javax.swing.JLabel pointsLabel;
    private javax.swing.JRadioButton secondOptionRadioButton;
    private javax.swing.JLabel secondPremiseLabel;
    private javax.swing.JRadioButton thirdOptionRadioButton;
    private javax.swing.JLabel thirdPremiseLabel;
    // End of variables declaration//GEN-END:variables
}

