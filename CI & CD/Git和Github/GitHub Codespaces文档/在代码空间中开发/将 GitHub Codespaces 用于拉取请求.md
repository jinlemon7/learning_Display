你可以在 Web 浏览器中或 Visual Studio Code 中使用 GitHub Codespaces 来创建拉取请求、审阅拉取请求和处理审阅注释。  

# 关于 GitHub Codespaces 中的拉取请求
  GitHub Codespaces 为你提供了处理拉取请求可能需要的许多功能：   
  - 创建拉取请求 - 使用终端和 Git 命令或“源代码管理”视图，可以像在 GitHub 上一样创建拉取请求。  
    如果存储库使用拉取请求模板，则可以在“源代码管理”视图中使用它  
  - 打开拉取请求 - 可以在代码空间中打开现有拉取请求，前提是你对要合并的分支具有代码空间访问权限。  
  - 审查拉取请求 - 在代码空间中打开拉取请求后，可以使用“GitHub 拉取请求”视图添加审查评论和批准拉取请求。  
    还可以使用 GitHub Codespaces 来查看审阅注释。  

# 在 Codespaces 中打开拉取请求
  1. 在仓库名称下，单击 “Pull requests”。  
     <img width="1440" height="115" alt="image" src="https://github.com/user-attachments/assets/3600a90e-b1d6-48fd-ad37-3d6f44c47da4" />

  2. 在拉取请求列表中，单击要在 Codespaces 中打开的拉取请求。  
  3. 在屏幕右侧，单击“ Code”。  
  4. 在 Codespaces 选项卡中，单击“+”。  
     <img width="910" height="894" alt="image" src="https://github.com/user-attachments/assets/c6a9c50c-ff2f-414a-9e69-4e3f22dba445" />

     为拉取请求分支创建 codespace，并在 GitHub Codespaces 的默认编辑器中打开。  

# 在 Codespaces 中审阅拉取请求  
  1. 将默认编辑器设置为 Visual Studio Code 或 Visual Studio Code for Web，在 codespace 中打开拉取请求，  
     如前文在 Codespaces 中打开拉取请求中所述。  
  2. 在活动栏中，单击 Git 拉取请求图标以显示“GitHub 拉取请求”边栏。 仅在 codespace 中打开拉取请求时，此图标才会显示在活动栏中。  
     <img width="774" height="486" alt="image" src="https://github.com/user-attachments/assets/4e30f69a-47cb-42ab-900c-c6216edfeae0" />

     如果在 codespace 中打开了拉取请求，并且活动栏中未显示拉取请求图标，请确保已登录到 GitHub。 单击活动栏中的 GitHub 图标，然后单击“登录”。  
     <img width="1050" height="712" alt="image" src="https://github.com/user-attachments/assets/270ff674-31b5-4854-baf6-188dc4b01929" />

  3. 若要查看对特定文件所做的更改，请在“GitHub 拉取请求”边栏中单击该文件的名称。  
     <img width="750" height="344" alt="image" src="https://github.com/user-attachments/assets/0f6d7457-32ff-4194-85f8-763fa3eb7346" />

     这会在编辑器中显示差异视图，左侧是基础分支中的文件版本，右侧是拉取请求的头分支中的文件的新版本。  
  4. 若要添加审阅注释，请单击编辑器右侧显示的文件中行号旁边的 + 符号。  
     <img width="1440" height="248" alt="image" src="https://github.com/user-attachments/assets/2640ade4-c59c-414a-ae41-f3850548e067" />

  5. 键入审阅注释，然后单击“开始审阅”。  
     <img width="1440" height="593" alt="image" src="https://github.com/user-attachments/assets/927c062d-578b-4f50-a4d4-b4ed9ea6e146" />

  6. 或者，可以建议更改，如果拉取请求的作者同意你的建议，则可以单击提交。  
     为此，请单击并按住要建议更改的第一行旁边的 + 符号，然后将该 + 符号拖动到要建议更改的最后一行。 然后单击显示的注释框中的“提出建议”。  

     所选行将复制到注释框中，可在其中对其进行编辑以建议更改。 可以在包含 ```suggestion``` 的行上方添加注释来解释建议的更改。  

     单击“添加注释”，将建议添加到拉取请求。  
     <img width="1440" height="803" alt="image" src="https://github.com/user-attachments/assets/c44ea020-5f49-4910-907e-615ad2abce32" />

  7. 添加完审阅注释后，可以在“GitHub 拉取请求”边栏中为拉取请求审阅添加摘要注释。  
     然后，可以单击“添加注释并提交”，或单击下拉箭头并选择“批准并提交”或“请求更改并提交” 。  
     <img width="1124" height="806" alt="image" src="https://github.com/user-attachments/assets/d6b5317f-4766-48ff-92db-01c1502e481a" />

  8. 查看 Codespaces 中审阅的评论  
     收到有关拉取请求的反馈后，可以在 Web 浏览器的 codespace 或 VS Code 中打开它，以查看审阅注释。 从那里，您可以回复评论、添加回复或关闭评论。  
