'*************
'Adam Ryan 
'Moga
'10/04/18
'Area Calculator 2
'*************
Public Class Form1
    Const dblPI = 3.1415926535897931
    Dim dblTriBase As Double
    Dim dblTriHeight As Double
    Dim dblCubLength As Double
    Dim dblCylRadius As Double
    Dim dblCylHeight As Double
    Private Sub btnTriSubmit_Click(sender As Object, e As EventArgs) Handles btnTriSubmit.Click
        Try
            dblTriBase = CDec(txtTriBase.Text)
            dblTriHeight = CDec(txtTriHeight.Text)
            lblTriArea.Text = dblTriBase * dblTriHeight / 2
        Catch
            MessageBox.Show("Numbers Only", "Error")
        End Try
    End Sub

    Private Sub btnTriClear_Click(sender As Object, e As EventArgs) Handles btnTriClear.Click
        txtTriBase.Text = ""
        txtTriHeight.Text = ""
        lblTriArea.Text = ""
    End Sub

    Private Sub btnCubSubmit_Click(sender As Object, e As EventArgs) Handles btnCubSubmit.Click
        Try
            dblCubLength = CDec(txtCubLength.Text)
            lblCubArea.Text = (dblCubLength ^ 2) * 6
        Catch
            MessageBox.Show("Numbers Only", "Error")
        End Try
    End Sub

    Private Sub btnCubClear_Click(sender As Object, e As EventArgs) Handles btnCubClear.Click
        lblCubArea.Text = ""
        txtCubLength.Text = ""
    End Sub

    Private Sub btnCylSubmit_Click(sender As Object, e As EventArgs) Handles btnCylSubmit.Click
        Try
            dblCylHeight = CDec(txtCylHeight.Text)
            dblCylRadius = CDec(txtCylRadius.Text)
            lblCylVolume.Text = dblPI * (dblCylRadius ^ 2) * dblCylHeight
        Catch
            MessageBox.Show("Numbers Only", "Error")
        End Try
    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        Me.Close()
    End Sub

    Private Sub btnCylClear_Click(sender As Object, e As EventArgs) Handles btnCylClear.Click
        lblCylVolume.Text = ""
        txtCylHeight.Text = ""
        txtCylRadius.Text = ""
    End Sub
End Class
