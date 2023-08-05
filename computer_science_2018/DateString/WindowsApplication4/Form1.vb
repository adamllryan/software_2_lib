'**************
'Adam Ryan
'Moga
'DateString
'9/13/2018
'**************
Public Class Form1

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub DateTimePicker1_ValueChanged(sender As Object, e As EventArgs)

    End Sub



    Private Sub btnSubmit_Click(sender As Object, e As EventArgs) Handles btnSubmit.Click
        If txtDay.Text = "" Or txtMonth.Text = "" Or txtYear.Text = "" Or txtWeek.Text = "" Then
            MessageBox.Show("One or more fields have not been completed", "Error",
    MessageBoxButtons.OK, MessageBoxIcon.Error)
        Else
            lblDate.Text = txtWeekday.Text & ", " & txtMonth.Text & "/" & txtDay.Text & "/" & txtYear.Text
        End If
    End Sub

   
    Private Sub lblDay_Click(sender As Object, e As EventArgs) Handles lblDay.Click

    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        Me.Close()
    End Sub

    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click
        txtWeekday.Text = ""
        txtDay.Text = ""
        txtMonth.Text = ""
        txtYear.Text = ""
        lblDate.Text = ""
    End Sub
End Class
