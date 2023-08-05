'*************************
'Adam Ryan
'Moga
'Simon Says
'12/18/18
Public Class game
    Dim rand As New Random
    Dim strCombo, x As String
    Dim intLength, intTemp, i, number, score As Integer
    Dim bolReady, bolActive, started As Boolean
    Dim lives As Integer = 3
    Dim splash As splash = New splash

    Function Red()
        My.Computer.Audio.Play(My.Resources.red, AudioPlayMode.Background)
        btnRed.BackColor = Color.Red
        btnGreen.BackColor = Color.Green
        btnBlue.BackColor = Color.DarkBlue
        btnYellow.BackColor = Color.Olive
    End Function
    Function Green()
        My.Computer.Audio.Play(My.Resources.green, AudioPlayMode.Background)
        btnRed.BackColor = Color.DarkRed
        btnGreen.BackColor = Color.Lime
        btnBlue.BackColor = Color.DarkBlue
        btnYellow.BackColor = Color.Olive
    End Function
    Function Blue()
        My.Computer.Audio.Play(My.Resources.blue, AudioPlayMode.Background)
        btnRed.BackColor = Color.DarkRed
        btnGreen.BackColor = Color.Green
        btnBlue.BackColor = Color.Blue
        btnYellow.BackColor = Color.Olive
    End Function
    Function Yellow()
        My.Computer.Audio.Play(My.Resources.yellow, AudioPlayMode.Background)
        btnRed.BackColor = Color.DarkRed
        btnGreen.BackColor = Color.Green
        btnBlue.BackColor = Color.DarkBlue
        btnYellow.BackColor = Color.Yellow
    End Function
    Function SimonSays()
        If bolReady = True Then
            Try
                Select Case i
                    Case strCombo.IndexOf("a", i)
                        MessageBox.Show("detected a")
                        i += 1
                        Red()
                    Case strCombo.IndexOf("b", i)
                        MessageBox.Show("detected b")
                        i += 1
                        Green()
                    Case strCombo.IndexOf("c", i)
                        MessageBox.Show("detected c")
                        i += 1
                        Blue()
                    Case strCombo.IndexOf("d", i)
                        MessageBox.Show("detected d")
                        i += 1
                        Yellow()
                End Select
                If i > intLength Then
                    bolReady = False
                    tmrSec.Enabled = False
                    lblcombo.Text = strCombo
                End If
            Catch
                MessageBox.Show("Error", "Something went wrong", MessageBoxButtons.OK, MessageBoxIcon.Error)
            End Try
            tmrDemo.Enabled = True
        End If
    End Function
    Function strGen()
        i = 0
        intTemp = Math.Round(rand.Next(4))
        Select Case intTemp
            Case 0
                MessageBox.Show("0")
                strCombo += "a"
            Case 1
                MessageBox.Show("1")
                strCombo += "b"
            Case 2
                MessageBox.Show("2")
                strCombo += "c"
            Case 3
                MessageBox.Show("3")
                strCombo += "d"
        End Select
        lblcombo.Text = strCombo & ", " & strCombo
        tmrSec.Enabled = True
    End Function
    Function Combo(color)
        If number + 1 = intLength Then
            MessageBox.Show("Completed")
            Threading.Thread.Sleep(500)
            intLength += 1
            number = 0
            bolReady = True
            bolActive = False
            MessageBox.Show(Math.Round(Rnd() * 4))
            strGen()
        End If
        Try
            If bolActive Then
                If strCombo.IndexOf("a", number) = number And color = "a" Then
                    lblnext.Text = ("correct a")
                    score += (10 * Rnd(10))
                    lbl2.Text = score
                    number += 1
                    lblcombo.Text = (lblcombo.Text).Substring(1)
                ElseIf strCombo.IndexOf("b", number) = number And color = "b" Then
                    lblnext.Text = ("correct b")
                    score += (10 * Rnd(10))
                    lbl2.Text = score
                    number += 1
                    lblcombo.Text = (lblcombo.Text).Substring(1)
                ElseIf strCombo.IndexOf("c", number) = number And color = "c" Then
                    lblnext.Text = ("correct c")
                    score += (10 * Rnd(10))
                    lbl2.Text = score
                    number += 1
                    lblcombo.Text = (lblcombo.Text).Substring(1)
                ElseIf strCombo.IndexOf("d", number) = number And color = "d" Then
                    lblnext.Text = ("correct d")
                    score += (10 * Rnd(10))
                    lbl2.Text = score
                    number += 1
                    lblcombo.Text = (lblcombo.Text).Substring(1)
                Else
                    number -= 1
                    MessageBox.Show("Wrong", "Oof", MessageBoxButtons.OK, MessageBoxIcon.Error)
                    lblnext.Text = (number)
                    lives -= 1
                    lblLives.Text = lives
                End If
                bolActive = False
            End If
        Catch
            lives -= 1
            number -= 1
            MessageBox.Show("Wrong", "Oof + 1", MessageBoxButtons.OK, MessageBoxIcon.Error)

        End Try
    End Function
    Private Sub btnStart_Click(sender As Object, e As EventArgs) Handles btnStart.Click
        intLength += 4
        started = True
        number = 0
        bolReady = True
        btnStart.Enabled = False
        MessageBox.Show(Math.Round(Rnd() * 4))
        strGen()
        strGen()
        strGen()
        strGen()
    End Sub
    Private Sub tmrDemo_Tick(sender As Object, e As EventArgs) Handles tmrDemo.Tick
        Label6.Text = number
        Label3.Text = intLength
    End Sub
    Private Sub Label6_Click(sender As Object, e As EventArgs) Handles Label6.Click
        Try
            number = InputBox("")
        Catch
            MessageBox.Show("You mush enter info", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error)
        End Try
    End Sub
    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        splash.Show()
    End Sub
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        If Label3.Visible Then
            Label3.Visible = False
            Label6.Visible = False
            lbl1.Visible = False
            lblcombo.Visible = False
            lbl2.Visible = False
            lblnext.Visible = False
        Else
            Label3.Visible = True
            Label6.Visible = True
            lbl1.Visible = True
            lblcombo.Visible = True
            lbl2.Visible = True
            lblnext.Visible = True
        End If
    End Sub
    Private Sub btnRed_Click(sender As Object, e As EventArgs) Handles btnRed.Click
        If started = True Then
            bolActive = True
        End If
        Red()
        Combo("a")
    End Sub
    Private Sub btnGreen_Click(sender As Object, e As EventArgs) Handles btnGreen.Click
        If started = True Then
            bolActive = True
        End If
        Green()
        Combo("b")
    End Sub
    Private Sub btnBlue_Click(sender As Object, e As EventArgs) Handles btnBlue.Click
        If started = True Then
            bolActive = True
        End If
        Blue()
        Combo("c")
    End Sub
    Private Sub tmrSec_Tick(sender As Object, e As EventArgs) Handles tmrSec.Tick
        btnRed.BackColor = Color.DarkRed
        btnGreen.BackColor = Color.Green
        btnBlue.BackColor = Color.DarkBlue
        btnYellow.BackColor = Color.Olive
        SimonSays()
        If lives = 0 Then
            lives = -1
            MessageBox.Show("Game Over. Your Score was: " & score, "You lost")
            Me.Close()
        End If
    End Sub
    Private Sub btnYellow_Click(sender As Object, e As EventArgs) Handles btnYellow.Click
        If started = True Then
            bolActive = True
        End If
        Yellow()
        Combo("d")
    End Sub
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        tmrSec.Interval = 500
    End Sub
End Class
