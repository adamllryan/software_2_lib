<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form1))
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.btnTriSubmit = New System.Windows.Forms.Button()
        Me.btnCubSubmit = New System.Windows.Forms.Button()
        Me.btnCylSubmit = New System.Windows.Forms.Button()
        Me.txtTriBase = New System.Windows.Forms.TextBox()
        Me.txtTriHeight = New System.Windows.Forms.TextBox()
        Me.txtCylHeight = New System.Windows.Forms.TextBox()
        Me.txtCylRadius = New System.Windows.Forms.TextBox()
        Me.txtCubLength = New System.Windows.Forms.TextBox()
        Me.lblTriArea = New System.Windows.Forms.Label()
        Me.lblCylVolume = New System.Windows.Forms.Label()
        Me.lblCubArea = New System.Windows.Forms.Label()
        Me.btnTriClear = New System.Windows.Forms.Button()
        Me.btnCylClear = New System.Windows.Forms.Button()
        Me.btnCubClear = New System.Windows.Forms.Button()
        Me.btnExit = New System.Windows.Forms.Button()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'PictureBox1
        '
        Me.PictureBox1.Image = CType(resources.GetObject("PictureBox1.Image"), System.Drawing.Image)
        Me.PictureBox1.Location = New System.Drawing.Point(12, 12)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(948, 618)
        Me.PictureBox1.TabIndex = 0
        Me.PictureBox1.TabStop = False
        '
        'btnTriSubmit
        '
        Me.btnTriSubmit.Font = New System.Drawing.Font("Times New Roman", 12.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnTriSubmit.Location = New System.Drawing.Point(322, 151)
        Me.btnTriSubmit.Name = "btnTriSubmit"
        Me.btnTriSubmit.Size = New System.Drawing.Size(75, 30)
        Me.btnTriSubmit.TabIndex = 1
        Me.btnTriSubmit.Text = "Submit"
        Me.btnTriSubmit.UseVisualStyleBackColor = True
        '
        'btnCubSubmit
        '
        Me.btnCubSubmit.Font = New System.Drawing.Font("Times New Roman", 12.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnCubSubmit.Location = New System.Drawing.Point(819, 37)
        Me.btnCubSubmit.Name = "btnCubSubmit"
        Me.btnCubSubmit.Size = New System.Drawing.Size(75, 30)
        Me.btnCubSubmit.TabIndex = 2
        Me.btnCubSubmit.Text = "Submit"
        Me.btnCubSubmit.UseVisualStyleBackColor = True
        '
        'btnCylSubmit
        '
        Me.btnCylSubmit.Font = New System.Drawing.Font("Times New Roman", 12.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnCylSubmit.Location = New System.Drawing.Point(313, 483)
        Me.btnCylSubmit.Name = "btnCylSubmit"
        Me.btnCylSubmit.Size = New System.Drawing.Size(75, 30)
        Me.btnCylSubmit.TabIndex = 3
        Me.btnCylSubmit.Text = "Submit"
        Me.btnCylSubmit.UseVisualStyleBackColor = True
        '
        'txtTriBase
        '
        Me.txtTriBase.Font = New System.Drawing.Font("Times New Roman", 12.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtTriBase.Location = New System.Drawing.Point(95, 257)
        Me.txtTriBase.Name = "txtTriBase"
        Me.txtTriBase.Size = New System.Drawing.Size(100, 26)
        Me.txtTriBase.TabIndex = 4
        '
        'txtTriHeight
        '
        Me.txtTriHeight.Font = New System.Drawing.Font("Times New Roman", 12.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtTriHeight.Location = New System.Drawing.Point(353, 60)
        Me.txtTriHeight.Name = "txtTriHeight"
        Me.txtTriHeight.Size = New System.Drawing.Size(100, 26)
        Me.txtTriHeight.TabIndex = 5
        '
        'txtCylHeight
        '
        Me.txtCylHeight.Font = New System.Drawing.Font("Times New Roman", 12.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtCylHeight.Location = New System.Drawing.Point(341, 435)
        Me.txtCylHeight.Name = "txtCylHeight"
        Me.txtCylHeight.Size = New System.Drawing.Size(100, 26)
        Me.txtCylHeight.TabIndex = 6
        '
        'txtCylRadius
        '
        Me.txtCylRadius.Font = New System.Drawing.Font("Times New Roman", 12.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtCylRadius.Location = New System.Drawing.Point(297, 346)
        Me.txtCylRadius.Name = "txtCylRadius"
        Me.txtCylRadius.Size = New System.Drawing.Size(100, 26)
        Me.txtCylRadius.TabIndex = 7
        '
        'txtCubLength
        '
        Me.txtCubLength.Font = New System.Drawing.Font("Times New Roman", 12.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtCubLength.Location = New System.Drawing.Point(580, 315)
        Me.txtCubLength.Name = "txtCubLength"
        Me.txtCubLength.Size = New System.Drawing.Size(100, 26)
        Me.txtCubLength.TabIndex = 8
        '
        'lblTriArea
        '
        Me.lblTriArea.AutoSize = True
        Me.lblTriArea.Font = New System.Drawing.Font("Times New Roman", 12.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblTriArea.Location = New System.Drawing.Point(105, 225)
        Me.lblTriArea.Name = "lblTriArea"
        Me.lblTriArea.Size = New System.Drawing.Size(39, 19)
        Me.lblTriArea.TabIndex = 9
        Me.lblTriArea.Text = "Area"
        '
        'lblCylVolume
        '
        Me.lblCylVolume.AutoSize = True
        Me.lblCylVolume.Font = New System.Drawing.Font("Times New Roman", 12.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblCylVolume.Location = New System.Drawing.Point(132, 529)
        Me.lblCylVolume.Name = "lblCylVolume"
        Me.lblCylVolume.Size = New System.Drawing.Size(39, 19)
        Me.lblCylVolume.TabIndex = 10
        Me.lblCylVolume.Text = "Area"
        '
        'lblCubArea
        '
        Me.lblCubArea.AutoSize = True
        Me.lblCubArea.Font = New System.Drawing.Font("Times New Roman", 12.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblCubArea.Location = New System.Drawing.Point(562, 114)
        Me.lblCubArea.Name = "lblCubArea"
        Me.lblCubArea.Size = New System.Drawing.Size(39, 19)
        Me.lblCubArea.TabIndex = 11
        Me.lblCubArea.Text = "Area"
        '
        'btnTriClear
        '
        Me.btnTriClear.Font = New System.Drawing.Font("Times New Roman", 12.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnTriClear.Location = New System.Drawing.Point(322, 187)
        Me.btnTriClear.Name = "btnTriClear"
        Me.btnTriClear.Size = New System.Drawing.Size(75, 30)
        Me.btnTriClear.TabIndex = 12
        Me.btnTriClear.Text = "Clear"
        Me.btnTriClear.UseVisualStyleBackColor = True
        '
        'btnCylClear
        '
        Me.btnCylClear.Font = New System.Drawing.Font("Times New Roman", 12.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnCylClear.Location = New System.Drawing.Point(313, 518)
        Me.btnCylClear.Name = "btnCylClear"
        Me.btnCylClear.Size = New System.Drawing.Size(75, 30)
        Me.btnCylClear.TabIndex = 13
        Me.btnCylClear.Text = "Clear"
        Me.btnCylClear.UseVisualStyleBackColor = True
        '
        'btnCubClear
        '
        Me.btnCubClear.Font = New System.Drawing.Font("Times New Roman", 12.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnCubClear.Location = New System.Drawing.Point(819, 73)
        Me.btnCubClear.Name = "btnCubClear"
        Me.btnCubClear.Size = New System.Drawing.Size(75, 30)
        Me.btnCubClear.TabIndex = 14
        Me.btnCubClear.Text = "Clear"
        Me.btnCubClear.UseVisualStyleBackColor = True
        '
        'btnExit
        '
        Me.btnExit.Font = New System.Drawing.Font("Times New Roman", 12.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnExit.Location = New System.Drawing.Point(819, 518)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.Size = New System.Drawing.Size(75, 30)
        Me.btnExit.TabIndex = 15
        Me.btnExit.Text = "Exit"
        Me.btnExit.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(1037, 642)
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.btnCubClear)
        Me.Controls.Add(Me.btnCylClear)
        Me.Controls.Add(Me.btnTriClear)
        Me.Controls.Add(Me.lblCubArea)
        Me.Controls.Add(Me.lblCylVolume)
        Me.Controls.Add(Me.lblTriArea)
        Me.Controls.Add(Me.txtCubLength)
        Me.Controls.Add(Me.txtCylRadius)
        Me.Controls.Add(Me.txtCylHeight)
        Me.Controls.Add(Me.txtTriHeight)
        Me.Controls.Add(Me.txtTriBase)
        Me.Controls.Add(Me.btnCylSubmit)
        Me.Controls.Add(Me.btnCubSubmit)
        Me.Controls.Add(Me.btnTriSubmit)
        Me.Controls.Add(Me.PictureBox1)
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.Name = "Form1"
        Me.Text = "Area Calculator 2"
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents PictureBox1 As System.Windows.Forms.PictureBox
    Friend WithEvents btnTriSubmit As System.Windows.Forms.Button
    Friend WithEvents btnCubSubmit As System.Windows.Forms.Button
    Friend WithEvents btnCylSubmit As System.Windows.Forms.Button
    Friend WithEvents txtTriBase As System.Windows.Forms.TextBox
    Friend WithEvents txtTriHeight As System.Windows.Forms.TextBox
    Friend WithEvents txtCylHeight As System.Windows.Forms.TextBox
    Friend WithEvents txtCylRadius As System.Windows.Forms.TextBox
    Friend WithEvents txtCubLength As System.Windows.Forms.TextBox
    Friend WithEvents lblTriArea As System.Windows.Forms.Label
    Friend WithEvents lblCylVolume As System.Windows.Forms.Label
    Friend WithEvents lblCubArea As System.Windows.Forms.Label
    Friend WithEvents btnTriClear As System.Windows.Forms.Button
    Friend WithEvents btnCylClear As System.Windows.Forms.Button
    Friend WithEvents btnCubClear As System.Windows.Forms.Button
    Friend WithEvents btnExit As System.Windows.Forms.Button

End Class
