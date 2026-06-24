package ui;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Apresentacao extends JFrame {

    // ── PALETA DE CORES ─────────────────────────────────────────────
    private static final Color COR_FUNDO          = new Color(0x0D, 0x0D, 0x0D); // preto fundo
    private static final Color COR_PAINEL         = new Color(0x1A, 0x1A, 0x1F); // prata escuro
    private static final Color COR_BORDA          = new Color(0x2C, 0x2C, 0x38); // prata médio escuro
    private static final Color COR_TITULO         = new Color(0x6D, 0xBC, 0xD4); // ciano suave
    private static final Color COR_TEXTO_CHAVE    = new Color(0xCC, 0xD0, 0xD6); // prata claro visível
    private static final Color COR_TEXTO_VALOR    = new Color(0xF0, 0xF2, 0xF5); // quase branco
    private static final Color COR_SEPARADOR      = new Color(0x4A, 0x7F, 0xA5); // azul aço
    private static final Color COR_BTN_ENTRAR     = new Color(0x2A, 0x5A, 0x78); // azul aço escuro
    private static final Color COR_BTN_ENTRAR_HOV = new Color(0x4A, 0x7F, 0xA5); // azul aço claro
    private static final Color COR_BTN_SAIR       = new Color(0x8B, 0x10, 0x10); // escarlate escuro
    private static final Color COR_BTN_SAIR_HOV   = new Color(0xBB, 0x18, 0x18); // escarlate médio
    private static final Color COR_AVISO          = new Color(0xC8, 0xA8, 0x50); // dourado acinzentado

    public Apresentacao() {
        configurarJanela();
        construirTela();
    }

    private void configurarJanela() {
        setTitle("Sistema de Gestão - Centro de Pesquisas Científicas");
        setSize(760, 540);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(COR_FUNDO);
    }

    private void construirTela() {

        JPanel painelPrincipal = new JPanel(new BorderLayout());
        painelPrincipal.setBackground(COR_FUNDO);
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(28, 48, 28, 48));

        JPanel painelCartao = new JPanel();
        painelCartao.setBackground(COR_PAINEL);
        painelCartao.setLayout(new BoxLayout(painelCartao, BoxLayout.Y_AXIS));
        painelCartao.setBorder(new CompoundBorder(
            new LineBorder(COR_BORDA, 1),
            BorderFactory.createEmptyBorder(28, 40, 28, 40)
        ));

        painelCartao.add(criarSeparador());
        painelCartao.add(Box.createVerticalStrut(20));

        painelCartao.add(criarLabel(
            "»»  BEM VINDO AO SISTEMA DE GESTÃO  ««",
            new Font("Serif", Font.BOLD, 20),
            COR_TITULO
        ));
        painelCartao.add(Box.createVerticalStrut(6));
        painelCartao.add(criarLabel(
            "DO CENTRO DE PESQUISAS DE LUANDA",
            new Font("Serif", Font.ITALIC, 15),
            COR_TEXTO_CHAVE
        ));

        painelCartao.add(Box.createVerticalStrut(20));
        painelCartao.add(criarSeparador());
        painelCartao.add(Box.createVerticalStrut(14));

        painelCartao.add(criarLabel(
            "UNIVERSIDADE CATÓLICA DE ANGOLA",
            new Font("SansSerif", Font.BOLD, 13),
            COR_TEXTO_VALOR
        ));

        painelCartao.add(Box.createVerticalStrut(14));
        painelCartao.add(criarSeparador());
        painelCartao.add(Box.createVerticalStrut(20));

        JPanel painelInfo = new JPanel(new GridLayout(4, 1, 0, 10));
        painelInfo.setBackground(COR_PAINEL);
        painelInfo.setAlignmentX(Component.CENTER_ALIGNMENT);
        painelInfo.setMaximumSize(new Dimension(660, 120));

        painelInfo.add(criarLinhaInfo("Projecto  :", "Sistema de Gestão de um Centro de Pesquisas Científicas"));
        painelInfo.add(criarLinhaInfo("Cadeira   :", "Fundamentos de Programação II"));
        painelInfo.add(criarLinhaInfo("Estudante :", "Manuel Manuel"));
        painelInfo.add(criarLinhaInfo("ID        :", "36618"));

        painelCartao.add(painelInfo);
        painelCartao.add(Box.createVerticalStrut(24));
        painelCartao.add(criarSeparador());
        painelCartao.add(Box.createVerticalStrut(24));

        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 24, 0));
        painelBotoes.setBackground(COR_PAINEL);
        painelBotoes.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton btnEntrar = criarBotao("  ENTRAR  ", COR_BTN_ENTRAR, COR_BTN_ENTRAR_HOV);
        JButton btnSair   = criarBotao("  SAIR    ", COR_BTN_SAIR,   COR_BTN_SAIR_HOV);

        btnEntrar.addActionListener(e -> aoEntrar());
        btnSair.addActionListener(e -> System.exit(0));

        painelBotoes.add(btnEntrar);
        painelBotoes.add(btnSair);
        painelCartao.add(painelBotoes);

        getRootPane().setDefaultButton(btnEntrar);
        KeyStroke esc = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0);
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(esc, "sair");
        getRootPane().getActionMap().put("sair", new AbstractAction() {
            public void actionPerformed(ActionEvent e) { System.exit(0); }
        });

        painelPrincipal.add(painelCartao, BorderLayout.CENTER);
        setContentPane(painelPrincipal);
    }

    private void aoEntrar() {
        getContentPane().removeAll();

        JPanel painelFora = new JPanel(new BorderLayout());
        painelFora.setBackground(COR_FUNDO);
        painelFora.setBorder(BorderFactory.createEmptyBorder(28, 48, 28, 48));

        JPanel painel = new JPanel();
        painel.setBackground(COR_PAINEL);
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.setBorder(new CompoundBorder(
            new LineBorder(COR_BORDA, 1),
            BorderFactory.createEmptyBorder(60, 40, 60, 40)
        ));

        painel.add(criarSeparador());
        painel.add(Box.createVerticalStrut(36));

        painel.add(criarLabel(
            "Fase de Login em desenvolvimento...",
            new Font("SansSerif", Font.BOLD, 16),
            COR_AVISO
        ));
        painel.add(Box.createVerticalStrut(10));
        painel.add(criarLabel(
            "Esta funcionalidade estará disponível em breve.",
            new Font("SansSerif", Font.PLAIN, 12),
            COR_TEXTO_CHAVE
        ));

        painel.add(Box.createVerticalStrut(36));
        painel.add(criarSeparador());
        painel.add(Box.createVerticalStrut(30));

        JButton btnVoltar = criarBotao("  SAIR  ", COR_BTN_SAIR, COR_BTN_SAIR_HOV);
        btnVoltar.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnVoltar.addActionListener(e -> System.exit(0));
        painel.add(btnVoltar);

        // TODO: substituir System.exit(0) por:
        // new LoginVisao().setVisible(true); dispose();

        painelFora.add(painel, BorderLayout.CENTER);
        setContentPane(painelFora);
        revalidate();
        repaint();
    }

    // ── MÉTODOS AUXILIARES ───────────────────────────────────────────

    private JLabel criarLabel(String texto, Font fonte, Color cor) {
        JLabel label = new JLabel(texto, SwingConstants.CENTER);
        label.setFont(fonte);
        label.setForeground(cor);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        return label;
    }

    private JPanel criarLinhaInfo(String chave, String valor) {
        JPanel linha = new JPanel(new FlowLayout(FlowLayout.CENTER, 8, 0));
        linha.setBackground(COR_PAINEL);

        JLabel lblChave = new JLabel(chave);
        lblChave.setFont(new Font("Monospaced", Font.BOLD, 13));
        lblChave.setForeground(COR_TEXTO_CHAVE);

        JLabel lblValor = new JLabel(valor);
        lblValor.setFont(new Font("Monospaced", Font.PLAIN, 13));
        lblValor.setForeground(COR_TEXTO_VALOR);

        linha.add(lblChave);
        linha.add(lblValor);
        return linha;
    }

    private JSeparator criarSeparador() {
        JSeparator sep = new JSeparator();
        sep.setForeground(COR_SEPARADOR);
        sep.setBackground(COR_PAINEL);
        sep.setMaximumSize(new Dimension(660, 1));
        return sep;
    }

    private JButton criarBotao(String texto, Color corNormal, Color corHover) {
        JButton btn = new JButton(texto) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(getModel().isRollover() ? corHover : corNormal);
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 8, 8);
                g2.dispose();
                super.paintComponent(g);
            }
        };
        btn.setFont(new Font("Monospaced", Font.BOLD, 13));
        btn.setForeground(COR_TEXTO_VALOR);
        btn.setOpaque(false);
        btn.setContentAreaFilled(false);
        btn.setBorderPainted(false);
        btn.setFocusPainted(false);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn.setPreferredSize(new Dimension(180, 42));
        btn.setBorder(BorderFactory.createEmptyBorder(0, 16, 0, 16));
        return btn;
    }
}