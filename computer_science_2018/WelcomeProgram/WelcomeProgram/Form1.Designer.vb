<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class ClickerGame
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.components = New System.ComponentModel.Container()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(ClickerGame))
        Me.lblClick = New System.Windows.Forms.Label()
        Me.Timer1 = New System.Windows.Forms.Timer(Me.components)
        Me.btnValueCounter = New System.Windows.Forms.Button()
        Me.btnClickerBuy = New System.Windows.Forms.Button()
        Me.btnMultiplierBuy = New System.Windows.Forms.Button()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.txtName = New System.Windows.Forms.TextBox()
        Me.btnContinue = New System.Windows.Forms.Button()
        Me.btnClickerSpeedBuy = New System.Windows.Forms.Button()
        Me.btnClickerMultiplierBuy = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'lblClick
        '
        Me.lblClick.AutoSize = True
        Me.lblClick.Font = New System.Drawing.Font("Microsoft Sans Serif", 50.0!)
        Me.lblClick.Location = New System.Drawing.Point(482, 81)
        Me.lblClick.Name = "lblClick"
        Me.lblClick.Size = New System.Drawing.Size(196, 76)
        Me.lblClick.TabIndex = 10
        Me.lblClick.Text = "Click!"
        Me.lblClick.Visible = False
        '
        'Timer1
        '
        Me.Timer1.Enabled = True
        Me.Timer1.Interval = 1000
        '
        'btnValueCounter
        '
        Me.btnValueCounter.Location = New System.Drawing.Point(578, 162)
        Me.btnValueCounter.Name = "btnValueCounter"
        Me.btnValueCounter.Size = New System.Drawing.Size(100, 100)
        Me.btnValueCounter.TabIndex = 11
        Me.btnValueCounter.Text = "0"
        Me.btnValueCounter.UseVisualStyleBackColor = True
        '
        'btnClickerBuy
        '
        Me.btnClickerBuy.Location = New System.Drawing.Point(637, 390)
        Me.btnClickerBuy.Name = "btnClickerBuy"
        Me.btnClickerBuy.Size = New System.Drawing.Size(75, 116)
        Me.btnClickerBuy.TabIndex = 12
        Me.btnClickerBuy.Text = "Clickers: 0 Cost: 100"
        Me.btnClickerBuy.UseVisualStyleBackColor = True
        '
        'btnMultiplierBuy
        '
        Me.btnMultiplierBuy.Location = New System.Drawing.Point(556, 268)
        Me.btnMultiplierBuy.Name = "btnMultiplierBuy"
        Me.btnMultiplierBuy.Size = New System.Drawing.Size(75, 116)
        Me.btnMultiplierBuy.TabIndex = 13
        Me.btnMultiplierBuy.Text = "Multiplier: 0 Cost: 20"
        Me.btnMultiplierBuy.UseVisualStyleBackColor = True
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(81, 39)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(63, 13)
        Me.Label2.TabIndex = 14
        Me.Label2.Text = "Enter Name"
        '
        'txtName
        '
        Me.txtName.Location = New System.Drawing.Point(84, 55)
        Me.txtName.Name = "txtName"
        Me.txtName.Size = New System.Drawing.Size(100, 20)
        Me.txtName.TabIndex = 15
        '
        'btnContinue
        '
        Me.btnContinue.Location = New System.Drawing.Point(84, 81)
        Me.btnContinue.Name = "btnContinue"
        Me.btnContinue.Size = New System.Drawing.Size(75, 23)
        Me.btnContinue.TabIndex = 16
        Me.btnContinue.Text = "Continue"
        Me.btnContinue.UseVisualStyleBackColor = True
        '
        'btnClickerSpeedBuy
        '
        Me.btnClickerSpeedBuy.Location = New System.Drawing.Point(556, 390)
        Me.btnClickerSpeedBuy.Name = "btnClickerSpeedBuy"
        Me.btnClickerSpeedBuy.Size = New System.Drawing.Size(75, 116)
        Me.btnClickerSpeedBuy.TabIndex = 17
        Me.btnClickerSpeedBuy.Text = "Speed: 0 Cost: 200"
        Me.btnClickerSpeedBuy.UseVisualStyleBackColor = True
        '
        'btnClickerMultiplierBuy
        '
        Me.btnClickerMultiplierBuy.Location = New System.Drawing.Point(637, 268)
        Me.btnClickerMultiplierBuy.Name = "btnClickerMultiplierBuy"
        Me.btnClickerMultiplierBuy.Size = New System.Drawing.Size(75, 116)
        Me.btnClickerMultiplierBuy.TabIndex = 18
        Me.btnClickerMultiplierBuy.Text = "ClickersMultiplier: 0 Cost: 1000"
        Me.btnClickerMultiplierBuy.UseVisualStyleBackColor = True
        '
        'ClickerGame
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.SystemColors.ControlLightLight
        Me.BackgroundImage = CType(resources.GetObject("$this.BackgroundImage"), System.Drawing.Image)
        Me.ClientSize = New System.Drawing.Size(858, 535)
        Me.Controls.Add(Me.btnClickerMultiplierBuy)
        Me.Controls.Add(Me.btnClickerSpeedBuy)
        Me.Controls.Add(Me.btnContinue)
        Me.Controls.Add(Me.txtName)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.btnMultiplierBuy)
        Me.Controls.Add(Me.btnClickerBuy)
        Me.Controls.Add(Me.btnValueCounter)
        Me.Controls.Add(Me.lblClick)
        Me.HelpButton = True
        Me.Name = "ClickerGame"
        Me.Text = "Welcome"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents lblClick As System.Windows.Forms.Label
    Friend WithEvents Timer1 As System.Windows.Forms.Timer
    Friend WithEvents btnValueCounter As System.Windows.Forms.Button
    Friend WithEvents btnClickerBuy As System.Windows.Forms.Button
    Friend WithEvents btnMultiplierBuy As System.Windows.Forms.Button
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents txtName As System.Windows.Forms.TextBox
    Friend WithEvents btnContinue As System.Windows.Forms.Button
    Friend WithEvents btnClickerSpeedBuy As System.Windows.Forms.Button
    Friend WithEvents btnClickerMultiplierBuy As System.Windows.Forms.Button

End Class
