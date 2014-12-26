import javax.swing.*
import java.awt.*
import java.awt.event.ActionListener
import java.awt.event.FocusListener
import java.awt.event.MouseListener
import java.awt.event.MouseMotionListener

frame = new JFrame(size: [300, 300],
        layout: new FlowLayout(),
        defaultCloseOperation: WindowConstants.EXIT_ON_CLOSE)
button = new JButton("click")
positionLabel = new JLabel("")
msgLabel = new JLabel("")
frame.contentPane.add button
frame.contentPane.add positionLabel
frame.contentPane.add msgLabel
button.addActionListener(
        { JOptionPane.showMessageDialog(frame, "You clicked!") } as ActionListener
)
displayMouseLocation = { positionLabel.setText("$it.x, $it.y") }
frame.addMouseListener(displayMouseLocation as MouseListener)
frame.addMouseMotionListener(displayMouseLocation as MouseMotionListener)
handleFocus = [
        focusGained: { msgLabel.setText("Good to see you!") },
        focusLost  : { msgLabel.setText("Come back soon!") }
]
button.addFocusListener(handleFocus as FocusListener)

events = ['WindowListener', 'ComponentListener']
// Above list may be dynamic and may come from some input 
handler = { msgLabel.setText("$it") }
for (event in events) {
    handlerImpl = handler.asType(Class.forName("java.awt.event.${event}"))
    frame."add${event}"(handlerImpl)
}
frame.setVisible(true)
