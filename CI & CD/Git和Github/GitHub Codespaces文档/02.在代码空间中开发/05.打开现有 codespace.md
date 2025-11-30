您可以在 GitHub、Visual Studio Code 中或使用 GitHub CLI 重新打开任何活动或已停止的代码空间。 无法重新打开已删除的 codespace。  

可以在“你的 codespace”页 ([github.com/codespaces](https://github.com/codespaces)) 上查看所有 codespace。 在此页中，可以：  
- 打开、停止或删除 codespace。
- 了解谁拥有 codespace（并可能为 codespace 付费）：你的个人帐户或你所属的组织。
- 查看 codespace 的计算机类型、大小和状态。
- 通过选择 GitHub 模板之一或单击“新建 codespace”来创建新的 codespace。
- 阻止自动删除 codespace。

# 从存储库页恢复 codespace  
  在 GitHub 上查看存储库时，可以快速恢复 codespace。  
  
  1. 在 GitHub 上显示存储库的“ Code”选项卡后，按“,”（逗号键）*。
     随即将显示“恢复 codespace”页。 这样可以恢复存储库当前所选分支的最近使用的 codespace，
     如果正在查看拉取请求，则恢复该拉取请求的主题分支的最近使用的 codespace。
     <img width="1028" height="1030" alt="image" src="https://github.com/user-attachments/assets/2c51dce6-2054-4628-bb15-4c3fc31c6248" />

  2. 单击“恢复此 codespace”。
     或者，如果要为存储库的此分支新建 codespace，请单击“新建 codespace”。
     
  > [!NOTE]  
  > 如果你在此分支没有现有的 codespace，则页面标题为“Create codespace”，并会显示一个标记为“Create a new codespace”的按钮。

  如果要快速返回到此页面地址以恢复 codespace，则可将此页面地址加入书签。
  或者你也可在链接中使用这个地址，为其他人提供一种快速方法来为此存储库创建和恢复自己的 codespace。

# 从“你的 codespaces”页打开现有 codespace
  1. 在 GitHub 的左上角，选择 ，然后单击“ Codespaces”，转到 [github.com/codespaces](https://github.com/codespaces) 上的“Your codespaces”页面。
  2. 要在默认编辑器中打开 codespace，请单击 codespace 的名称。
     您可以在个人设置页面中设置 Codespaces 的默认编辑器。 请参阅 [设置 GitHub Codespaces 的默认编辑器](https://docs.github.com/zh/codespaces/setting-your-user-preferences/setting-your-default-editor-for-github-codespaces)。

     如需从非默认编辑器中打开 codespace，请执行以下操作：  
     a. 单击要打开的 codespace 右侧的省略号 (...)。  
     b. 单击“在...中打开”。  
     c. 单击“在应用程序中打开”。  

     可以在以下项中打开 codespace：
     - 浏览器
     - Visual Studio Code
     - JupyterLab

  如果选择 Visual Studio Code（桌面应用程序），则必须确保已在本地计算机上安装VS Code。  
  
  如果选择“JupyterLab”，则必须在 codespace 中安装 JupyterLab 应用程序。  
  默认开发容器映像包括 JupyterLab，因此从默认映像创建的 codespaces 将始终安装 JupyterLab。  
  有关默认映像的详细信息，请参阅“[开发容器简介](https://docs.github.com/zh/codespaces/setting-up-your-project-for-codespaces/adding-a-dev-container-configuration/introduction-to-dev-containers#using-the-default-dev-container-configuration)”以及 [`devcontainers/images`](https://github.com/devcontainers/images/tree/main/src/universal) 仓库。  
  如果未在开发容器配置中使用默认映像，则可以通过将 `ghcr.io/devcontainers/features/python` 功能添加到` devcontainer.json` 文件来安装 JupyterLab。  
  应该包括选项 "`installJupyterlab": true`。 有关详细信息，请参阅 `devcontainers/features` 存储库中[`python`](https://github.com/devcontainers/features/tree/main/src/python#python-python) 功能的 README 文件。  
  
# 链接到现有 codespace
  可以创建指向现有 codespace 的链接。 如果你有一个经常返回的长期 codespace，这将非常有用。   
  可以将链接保存在你选择的位置中，作为使用 [https://github.com/codespaces](https://github.com/codespaces) 上的链接的替代项。  

  > [!NOTE]
  > 你只能打开自己的 codespace。 如果有人单击指向你的其中一个 codespace 的链接，他们将看到 404 错误消息。

  使用以下其中一种 URL 模式创建链接。 在这些 URL 中，CODESPACE-NAME 表示 Codespace 的唯一永久名称，  
  例如 literate-space-parakeet-w5vg5ww5p793g7g9，而不是 Codespace 的显示名称。  
  你可以通过将链接复制到 [https://github.com/codespaces](https://github.com/codespaces) 页面上的 codespace 并从 URL 中提取 codespace 名称来查找 codespace 的名称。  

  | 链接将打开于 | 链接语法 |  
  | ----------- | ------- |  
  | VS Code Web 客户端| `https://CODESPACE-NAME.github.dev` |  
  | 具有指定工作区的 VS Code Web 客户端 | `https://CODESPACE-NAME.github.dev?folder=/workspaces/PATH/TO/WORKSPACE/DIRECTORY` |  
  | VS Code 桌面应用程序 | `https://github.com/codespaces/CODESPACE-NAME?editor=vscode` |  
  | JupyterLab | `https://github.com/codespaces/CODESPACE-NAME?editor=jupyter` |  
  
