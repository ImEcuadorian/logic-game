/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this
 * license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package io.github.imecuadorian.logicgame.views;

import io.github.imecuadorian.logicgame.model.DeductiveQuestion;
import io.github.imecuadorian.logicgame.model.InductiveQuestion;
import io.github.imecuadorian.logicgame.model.Player;
import io.github.imecuadorian.logicgame.model.Score;
import io.github.imecuadorian.logicgame.repositories.Repository;
import io.github.imecuadorian.logicgame.services.DeductiveQuestionService;
import io.github.imecuadorian.logicgame.services.DeductiveQuestionServiceImpl;
import io.github.imecuadorian.logicgame.services.InductiveQuestionService;
import io.github.imecuadorian.logicgame.services.InductiveQuestionServiceImpl;
import io.github.imecuadorian.logicgame.services.PlayerService;
import io.github.imecuadorian.logicgame.services.ScoreService;
import io.github.imecuadorian.logicgame.services.ScoreServiceImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Hugo Saldarriaga
 */
public class PrincipalForm
	extends JFrame {

	/**
	 * Creates new form PrincipalForm
	 */

	private final DeductiveQuestionService deductiveQuestionService;
	private final InductiveQuestionService inductiveQuestionService;
	private final ScoreService scoreService;
	private final PlayerService playerService;
	private Player player;
	public PrincipalForm(
		Repository<DeductiveQuestion, Integer> deductiveQuestionRepository,
		Repository<InductiveQuestion, Integer> inductiveQuestionRepository,
		PlayerService playerService,
		Player player,
		Repository<Score, Integer> scoreRepository
	) {
		initComponents();
		this.deductiveQuestionService =
			new DeductiveQuestionServiceImpl(deductiveQuestionRepository);
		this.inductiveQuestionService =
			new InductiveQuestionServiceImpl(inductiveQuestionRepository);
		this.playerService = playerService;
		this.player = player;
		this.scoreService = new ScoreServiceImpl(scoreRepository);
		loadPlayerName();
		this.setLocationRelativeTo(null);
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT
	 * modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        backgroundPrincipalForm = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        playDeductiveButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        playInductiveButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dashBoardjPanel = new javax.swing.JPanel();
        jPanelMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();
        playerName1 = new javax.swing.JLabel();
        playerName2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        playerName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(150, 105, 60));
        setResizable(false);

        backgroundPrincipalForm.setBackground(new java.awt.Color(44, 83, 100));

        jPanel5.setBackground(new java.awt.Color(230, 35, 5));

        playDeductiveButton.setBackground(new java.awt.Color(230, 163, 67));
        playDeductiveButton.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        playDeductiveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_play_deductive_70px.png"))); // NOI18N
        playDeductiveButton.setToolTipText("Seleccionar la respuesta correcta");
        playDeductiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playDeductiveButtonActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_abc_96px.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Razonamiento Deductivo");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(playDeductiveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel8)
                .addGap(30, 30, 30)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(28, 28, 28)))
                .addComponent(playDeductiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBackground(new java.awt.Color(69, 66, 227));

        playInductiveButton.setBackground(new java.awt.Color(120, 66, 226));
        playInductiveButton.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        playInductiveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_play_inductive_70px.png"))); // NOI18N
        playInductiveButton.setToolTipText("Apareceran opciones y se debera seleccionar la respuesta correcta");
        playInductiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playInductiveButtonActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_decision_96px.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Razonamiento Inductivo");
        jLabel11.setToolTipText("");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(playInductiveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel10)
                .addGap(36, 36, 36)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel10))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(playInductiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        dashBoardjPanel.setBackground(new java.awt.Color(32, 58, 67));

        jPanelMenu.setBackground(new java.awt.Color(15, 32, 39));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("JUEGO LOGICA");

        searchLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_search_96px.png"))); // NOI18N

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        playerName1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        playerName1.setForeground(new java.awt.Color(255, 255, 255));
        playerName1.setText("CREDITOS");

        playerName2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        playerName2.setForeground(new java.awt.Color(255, 255, 255));
        playerName2.setText("RANKING");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_idea_96px.png"))); // NOI18N

        javax.swing.GroupLayout dashBoardjPanelLayout = new javax.swing.GroupLayout(dashBoardjPanel);
        dashBoardjPanel.setLayout(dashBoardjPanelLayout);
        dashBoardjPanelLayout.setHorizontalGroup(
            dashBoardjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashBoardjPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dashBoardjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerName2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerName1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(19, 19, 19))
        );
        dashBoardjPanelLayout.setVerticalGroup(
            dashBoardjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashBoardjPanelLayout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(playerName2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(playerName1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        playerName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        playerName.setForeground(new java.awt.Color(255, 255, 255));
        playerName.setText("NOMBRE JUGADOR : ");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_mental_96px.png"))); // NOI18N

        javax.swing.GroupLayout backgroundPrincipalFormLayout = new javax.swing.GroupLayout(backgroundPrincipalForm);
        backgroundPrincipalForm.setLayout(backgroundPrincipalFormLayout);
        backgroundPrincipalFormLayout.setHorizontalGroup(
            backgroundPrincipalFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPrincipalFormLayout.createSequentialGroup()
                .addComponent(dashBoardjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundPrincipalFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPrincipalFormLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPrincipalFormLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38)
                        .addComponent(playerName, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        backgroundPrincipalFormLayout.setVerticalGroup(
            backgroundPrincipalFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashBoardjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundPrincipalFormLayout.createSequentialGroup()
                .addGroup(backgroundPrincipalFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPrincipalFormLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3))
                    .addGroup(backgroundPrincipalFormLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(playerName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77)
                .addGroup(backgroundPrincipalFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPrincipalForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPrincipalForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

	private void playDeductiveButtonActionPerformed(ActionEvent evt) {//GEN-FIRST
		// :event_playDeductiveButtonActionPerformed
		// TODO add your handling code here:
		QuestionView deductiveView = new QuestionView(this, true, deductiveQuestionService,
		                                              playerService, player, scoreService);
		deductiveView.setVisible(true);
	}                                                   

	private void playInductiveButtonActionPerformed(ActionEvent evt) {//GEN-FIRST
		// :event_playInductiveButtonActionPerformed
		// TODO add your handling code here:
		QuestionInductiveView inductiveView = new QuestionInductiveView(
			this,
			true,
			inductiveQuestionService);
		inductiveView.setVisible(true);
	}                                                   

	private void loadPlayerName() {
		playerName.setText("NOMBRE JUGADOR : " + player.getUsername());
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPrincipalForm;
    private javax.swing.JPanel dashBoardjPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JButton playDeductiveButton;
    private javax.swing.JButton playInductiveButton;
    private javax.swing.JLabel playerName;
    private javax.swing.JLabel playerName1;
    private javax.swing.JLabel playerName2;
    private javax.swing.JLabel searchLabel;
    // End of variables declaration//GEN-END:variables
}
