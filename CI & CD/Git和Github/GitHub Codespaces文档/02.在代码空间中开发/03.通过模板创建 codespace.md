  如果要启动新项目，可以通过从模板创建 codespace 来快速开始开发工作。   
  你将能够在基于云的开发环境中处理项目、将文件保存在云中，以及将工作发布到可与他人共享或克隆到本地计算机的新远程存储库中。  

  可以从空白模板开始着手，从 GitHub 维护的模板中选择 React 或 Jupyter Notebook 等常用技术，或者从 GitHub 上的任何模板存储库中启动 codespace。  

  使用空白模板时，你将从空目录开始创建，并且可以访问基于云的计算资源，以及预安装了默认 dev 容器映像的工具、语言和运行时环境。  
  使用其他模板时，你将获得当前所用技术的入门文件，通常还有一些额外文件，例如自述文件、.gitignore 文件和包含一些自定义环境配置的开发容器配置文件。  

  例如，如果通过 GitHub 的React 模板创建 codespace，则将到达包含简单应用程序的模板文件的工作区中，例如 index.js、app.js 和 package.json。   
  在 codespace 打开后不久，开发服务器将自动启动，并且你将能够在 VS Code Web 客户端内的简单浏览器选项卡中查看正在运行的应用程序。  
  <img width="1440" height="818" alt="image" src="https://github.com/user-attachments/assets/ed348780-51e5-42f9-aa40-5c88869b5bf4" />

  模板中包含的文件和配置在模板存储库中定义。 创建 codespace 时，模板存储库将克隆到 codespace 中。   
  之后，链接将被切断，并且 codespace 将不会链接到远程存储库，直到你发布到远程存储库为止。  

  > [!TIP]
  > 为了帮助用户开始使用你的框架、库或其他项目，你可以设置模板存储库，以便与 GitH ub Codespaces 配合使用。  
  > 有关详细信息，请参阅“[为 GitHub Codespaces 设置模板存储库](https://docs.github.com/zh/codespaces/setting-up-your-project-for-codespaces/setting-up-your-repository/setting-up-a-template-repository-for-github-codespaces)”。  

# 通过 GitHub 模板创建 codespace
  GitHub 维护的模板（包括空白模板）在“你的 codespace”页中提供。  

  1. 在 GitHub 的左上角，选择 ，然后单击“ Codespaces”，转到 [github.com/codespaces](https://github.com/codespaces) 上的“Your codespaces”页面。
  2. 若要查看模板的完整列表，请在“浏览快速入门模板”部分，单击“查看全部”。
     <img width="1440" height="578" alt="image" src="https://github.com/user-attachments/assets/d366aa20-8b25-4f25-b476-85bb767d9c3b" />
  3. （可选）若要查看包含模板文件的模板存储库，请单击模板的名称
     <img width="1440" height="462" alt="image" src="https://github.com/user-attachments/assets/4b67b627-b294-47f8-b7b4-f0380364e153" />
  4. 在要启动的模板名称下，单击“使用此模板”。

  从模板创建新的 codespace 时，始终会在 Visual Studio Code Web 客户端中打开它。 可以在任何受支持的编辑器中重新打开现有 codespace。  
  有关详细信息，请参阅“[打开现有 codespace](https://docs.github.com/zh/codespaces/developing-in-codespaces/opening-an-existing-codespace)”。

# 通过模板存储库创建 codespace
  可以通过任何模板存储库创建 codespace，然后在准备就绪后将工作发布到新存储库。 有关模板仓库的详细信息，请参阅 [从模板创建仓库](https://docs.github.com/zh/repositories/creating-and-managing-repositories/creating-a-repository-from-a-template#about-repository-templates)。 
  1. 在 GitHub 上，导航到存储库的主页面。
  2. 单击“使用此模板”，然后单击“在 codespace 中打开”。
     <img width="800" height="338" alt="image" src="https://github.com/user-attachments/assets/2dfd326f-a551-432f-a1ce-f83863c1320e" />

  > [!NOTE]
  > 如果你是模板存储库的维护者，并且要将更改提交到模板存储库本身，则应通过“ Code”下拉列表创建 codespace。

  从模板创建新的 codespace 时，始终会在 Visual Studio Code Web 客户端中打开它。 可以在任何受支持的编辑器中重新打开现有 codespace。  

# 发布到 GitHub上的仓库
  在从模板创建的 codespace 中工作时，你的工作将保存在云中的虚拟机上，但不会存储在 GitHub 上的存储库中。  

  可以保存文件、关闭并停止 codespace，稍后再返回工作。 通常会预安装 Git，工作目录将自动初始化为 Git 存储库，除非你从 GitHub 的空白模板开始。  
  这意味着可以立即使用 Git 进行本地源代码管理，例如添加和提交文件  

  但是，如果删除未发布的 codespace，或者该 codespace 由于在保持期内未使用而被自动删除，则你的工作也会被删除。  
  若要持久保存你的工作并允许其他人处理你的项目，你需要将 codespace 发布到 GitHub 上的存储库。  

# 从 VS Code 发布
  如果你使用的是 codespace，可以从 VS Code Web 客户端或桌面应用程序发布它。  

  1. 在活动栏中，单击“源代码管理”视图。
     <img width="916" height="478" alt="image" src="https://github.com/user-attachments/assets/cd0bd000-fe05-4782-bfd1-4866e30b4f2a" />

  2. 要暂存更改，请单击已添加或更改文件旁边的 +，如果你更改了多个文件并希望全部暂存，请单击“Changes”旁边的按钮
     <img width="918" height="378" alt="image" src="https://github.com/user-attachments/assets/2f7e0f5d-f8f3-4bdc-ac4f-e4b9b9097efb" />

  > [!NOTE]
  > 如果从 GitHub 的空白模板开始，则不会看到更改列表，除非已将目录初始化为 Git 存储库。  
  > 若要发布从空白模板创建的 codespace，请在“源代码管理”视图中单击“发布到 GitHub”，然后跳到步骤 5。  

  3. 若要提交暂存更改，请键入描述所做更改的提交消息，然后单击“提交”。
     <img width="918" height="410" alt="image" src="https://github.com/user-attachments/assets/47104c70-4bbe-4e8d-bdfb-76aa7fa5483a" />

  4. 单击“发布分支”。
     <img width="872" height="354" alt="image" src="https://github.com/user-attachments/assets/dba51b24-1d2d-4982-90b6-6076ba2758a4" />

  5. 在“存储库名称”下拉列表中，键入新存储库的名称，然后选择“发布到 GitHub 专用存储库”或“发布到 GitHub 公共存储库”。
     <img width="1254" height="216" alt="image" src="https://github.com/user-attachments/assets/a8e92be2-5378-4712-a5d5-6bf1e0ce9dc4" />\

     新存储库的所有者将是创建 codespace 时所使用的 GitHub 帐户。
  6. （可选）在编辑器右下角显示的弹出窗口中，单击“在 GitHub 上打开”，查看 GitHub 上的新存储库。
     <img width="1252" height="318" alt="image" src="https://github.com/user-attachments/assets/87ecf70d-ccb5-4c83-9014-f884abfc27d2" />

  发布 codespace 后，你可以使用更多选项来自定义 GitHub Codespaces 体验。 例如，可以：  
  - 更改 codespace 的计算机类型，以确保使用适合你当前所执行工作的资源（请参阅 [更改代码空间的计算机类型](https://docs.github.com/zh/codespaces/customizing-your-codespace/changing-the-machine-type-for-your-codespace)）。
  - 允许 GitHub 自动使用 GPG 对你在 codespace 中的提交进行签名（请参阅 [管理 GitHub Codespaces 的 GPG 验证](https://docs.github.com/zh/codespaces/managing-your-codespaces/managing-gpg-verification-for-github-codespaces)）。
  - 与你的 codespace 共享机密（请参阅 [管理 GitHub Codespaces 特定于帐户的机密](https://docs.github.com/zh/codespaces/managing-your-codespaces/managing-your-account-specific-secrets-for-github-codespaces)）。

# 从 GitHub发布
  可以从 GitHub 上“你的 codespaces”页面中发布未发布的 codespace。 如果要发布当前未在浏览器中打开的 codespace，此做法非常有用。  
  如果执行此操作，你的工作将保留在存储库中，但现有 codespace 和新存储库之间不会有链接。   
  但是，你可以导航到新存储库并从那里创建 codespace，并且此 codespace 将连接到存储库。  

  1. 在 GitHub 的左上角，选择 ，然后单击“ Codespaces”，转到 [github.com/codespaces](https://github.com/codespaces) 上的“Your codespaces”页面。
  2. 在未发布的 codespace 旁边，单击省略号 (...) ，然后选择“发布到新存储库” 。
     <img width="730" height="418" alt="image" src="https://github.com/user-attachments/assets/58d31054-40e4-4cdc-9afa-6342fc82b16d" />

  3. 为新存储库选择一个名称，将其设置为“公共”或“专用”，然后单击“创建存储库” 。
     <img width="568" height="1042" alt="image" src="https://github.com/user-attachments/assets/9d3c8716-afd5-4e53-96b2-16994c536677" />

  4. （可选）若要查看新存储库，请单击“查看存储库”。
  
