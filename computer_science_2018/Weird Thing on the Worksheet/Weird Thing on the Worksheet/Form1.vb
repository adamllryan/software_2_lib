'********************************
'Adam RYan
'Moga
'Calculate Button Thing
'9/20/18
'********************************
Public Class Form1

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        lblABC.Text = 3.14159 * 0.5
        lblXYZ.Text = 6 * 9
        lblResult.Text = 5 \ 3
        lblAnswer.Text = 12 / 7
        lblDone.Text = 9 Mod 4
        lblFinish.Text = 12 Mod 3
    End Sub
End Class
