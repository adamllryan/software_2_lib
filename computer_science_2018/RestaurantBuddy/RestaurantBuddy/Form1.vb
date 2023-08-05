'*************************************
'Adam Ryan
'Moga
'09/27/18
'RestaurantBuddy
'*************************************
Public Class Form1
    Dim DecBill As Decimal
    Dim intPeople As Integer
    Dim DecTotal As Decimal
    Private Sub txtBill_TextChanged(sender As Object, e As EventArgs) Handles txtBill.TextChanged

    End Sub

    Private Sub cmbTip_SelectedIndexChanged(sender As Object, e As EventArgs) Handles cmbTip.SelectedIndexChanged

        If txtBill.Text <> "" And txtBill.Text And (cmbTip.Text = "15%" Or cmbTip.Text = "18%" Or cmbTip.Text = "20%") And txtPeople.Text <> "" Then
            DecBill = CDec(txtBill.Text)
            intPeople = CInt(txtPeople.Text)
            If cmbTip.Text = "15%" Then
                lblTip.Text = (DecBill * 0.15 / intPeople).ToString("c")
            End If
            If cmbTip.Text = "18%" Then
                lblTip.Text = (DecBill * 0.18 / intPeople).ToString("c")
            End If
            If cmbTip.Text = "20%" Then
                lblTip.Text = (DecBill * 0.2 / intPeople).ToString("c")
            End If
            DecTotal = CDec(lblTip.Text) + DecBill / intPeople
            lblTotal.Text = DecTotal.ToString("c")
        End If
        
    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        Me.Close()
    End Sub

    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click
        txtBill.Text = ""
        lblTip.Text = ""
        cmbTip.Text = "% Tip"
        txtPeople.Text = ""
        lblTotal.Text = ""
    End Sub

    Private Sub Label1_Click(sender As Object, e As EventArgs) Handles lblTotal.Click

    End Sub

    Private Sub txtPeople_TextChanged(sender As Object, e As EventArgs) Handles txtPeople.TextChanged
        If txtPeople.Text <> "" Then
            intPeople = CInt(txtPeople.Text)
        End If
    End Sub

    Private Sub lblPeople_Click(sender As Object, e As EventArgs) Handles lblPeople.Click

    End Sub

   
End Class
