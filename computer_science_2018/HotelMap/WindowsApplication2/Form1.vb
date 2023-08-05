'********************************'
'Adam Ryan
'8/30/18
'Chapter 2 Tutorial
'*************************************'
Public Class Form1
    'display directions'
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles btnDirections.Click
        Label2.Visible = True
    End Sub
    'exit'
    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        Me.Close()
    End Sub
End Class
