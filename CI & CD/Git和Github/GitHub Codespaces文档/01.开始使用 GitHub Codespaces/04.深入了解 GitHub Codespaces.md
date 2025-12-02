GitHub Codespaces 是一个基于云的即时开发环境，它使用容器为你提供用于开发的通用语言、工具和实用程序。  
GitHub Codespaces 也是可配置的，通过它可为项目创建自定义的开发环境。  
通过为项目配置自定义开发环境，可以为项目的所有用户提供可重复的代码空间配置。  

# 创建代码空间
  有许多入口点可用于创建代码空间。  
  - 通过 GitHub 模板或 GitHub 上的任何模板存储库启动新项目
  - 使用存储库中的分支进行新功能工作
  - 使用打开的拉取请求探索正在进行的工作
  - 使用存储库历史记录中的提交项调查特定时间点的 bug。

  可以在 GitHub 上、Visual Studio Code 中或使用 GitHub CLI 创建代码空间。  
  如果需要测试某些内容，则代码空间可以是短暂的，或者可以返回到同一代码空间来处理长时间运行的功能工作。  

  有关详细信息，请参阅 [为存储库创建 codespace](https://docs.github.com/zh/codespaces/developing-in-a-codespace/creating-a-codespace-for-a-repository)、  
  [通过模板创建 codespace](https://docs.github.com/zh/codespaces/developing-in-a-codespace/creating-a-codespace-from-a-template)，  
  以及 [打开现有 codespace](https://docs.github.com/zh/codespaces/developing-in-a-codespace/opening-an-existing-codespace)。
  > [!note]   
  > 每个仓库甚至每个分支可创建多个代码空间。 但是，可以创建的 codespace 数量和可以同时运行的 codespace 数量受到限制。  
  > 如果达到最大 codespace 数并尝试创建另一个 codespace，则会显示一条消息，告知你必须删除现有 codespace，然后才能创建新的 codespace。

## codespace 创建过程
  创建 codespace 时，各个步骤将在后台执行，然后 codespace 可供你使用。  

### 步骤 1：将虚拟机和存储分配给代码空间
  创建 codespace 时，将使用 VM 主机映像的稳定版本或 公共预览版 版本创建虚拟机 (VM)。  
  主机映像定义了用于创建 VM 的 Linux 版本。 VM 既是你专用的，也是你专属的。 拥有专用虚拟机可确保您拥有该计算机中可供使用的整个计算资源集。  
  如有必要，这还允许您对容器具有完全根访问权限。  

  然后会创建仓库的[浅克隆](https://github.blog/2020-12-21-get-up-to-speed-with-partial-clone-and-shallow-clone/)，如果是通过模板创建 codespace，则将创建模板仓库的浅克隆。  
  这会克隆到 VM 的 /workspaces 目录中，随后装载到开发容器中。 有关详细信息，请参阅下面的[关于 codespace 的目录结构](https://docs.github.com/zh/codespaces/about-codespaces/deep-dive#about-the-directory-structure-of-a-codespace)。  
  
### 步骤 2：创建开发容器
  GitHub Codespaces 使用 Docker 容器作为开发环境。 此容器是根据你可以在 devcontainer.json 文件以及 Dockerfile（可选）中定义的配置创建的。  
  如果通过 GitHub 的空白模板或不包含 devcontainer.json 文件的存储库创建 codespace，GitHub Codespaces 将使用具有多种语言和运行时的默认映像。   
  有关详细信息，请参阅“[开发容器简介](https://docs.github.com/zh/codespaces/setting-up-your-project-for-codespaces/adding-a-dev-container-configuration/introduction-to-dev-containers)”。   
  要详细了解默认开发容器映像包含的内容，请参阅 [`devcontainers/images`](https://github.com/devcontainers/images/tree/main/src/universal) 仓库。  
  > [!note]
  > 如果要在 codespace 中使用 Git 挂钩，并将 [git 模板目录](https://git-scm.com/docs/git-init#_template_directory)
  > 中的任何内容应用于 codespace，则必须在创建容器后在步骤 4 中设置挂钩。
  >
  > 由于存储库在创建容器之前已克隆到主机 VM 上，因此 git 模板目录中的任何内容都不会应用于 codespace，
  > 除非你在步骤 4 中使用 postCreateCommand 在 devcontainer.json 配置文件中设置挂钩。 有关详细信息，请参阅步骤 4：创建后设置。  

###  步骤 3：连接到代码空间
  创建容器并运行任何其他初始化后，您将连接到代码空间。 可以使用以下方法建立连接：  
  - Web 浏览器
  - Visual Studio Code
  - GitHub CLI

### 步骤 4：创建后设置
  连接到 codespace 后，你的自动设置可能会根据你在 `devcontainer.json `文件中指定的配置继续构建。   
  你可能会看到 `postCreateCommand` 和 `postAttachCommand` 运行  

  如果要在 codespace 中使用 Git 挂钩，请使用` devcontainer.json` 生命周期脚本设置挂钩，例如 postCreateCommand。  

  如果你有一个用于 GitHub Codespaces 的公共 dotfile 存储库，则可以启用它以用于新的 codespace。   
  启用后，您的 dotfile 将被克隆到容器中，并且将调用安装脚本。  
  有关详细信息，请参阅“[个性化你帐户的 GitHub Codespaces](https://docs.github.com/zh/codespaces/setting-your-user-preferences/personalizing-github-codespaces-for-your-account#dotfiles)”。  
  
  最后，如果通过存储库创建了 codespace，则会使用完整克隆复制存储库的整个历史记录。   
  如果通过模板创建了 codespace，则不会保留模板存储库的完整历史记录；除非改为使用空白模板，否则将从模板存储库内容的初始提交开始。  
  
  在创建后设置期间，您仍然可以使用集成终端并对文件进行编辑，但要注意避免工作与正在运行的命令之间存在任何争用条件。  

# Codespaces 生命周期
## 在代码空间中保存文件
  根据所用的编辑器以常规方式保存对文件的更改。  
  如果要处理 Visual Studio Code 中的 codespace，则可以启用自动保存以确保始终保存所做更改。  

## 关闭或停止代码空间
  使用 codespace 时，它将保持运行，但在处于非活动状态一段时间后会超时。  
  编辑器和终端输出中的文件更改将计为活动，因此，如果终端输出继续，codespace 将不会超时。  
  默认非活动超时期限为 30 分钟。   
  可以为创建的 codespace 定义个人超时设置，但这可能会被组织超时策略覆盖。  

  如果 codespace 超时，它将停止运行，但可通过以下方式重启：  
  浏览器选项卡（如果在浏览器中使用 codespace）、VS Code、[https://github.com/codespaces](https://github.com/codespaces) 中的 codespace 列表  

  可通过以下方式停止 codespace  
  - 浏览器：在 [https://github.com/codespaces](https://github.com/codespaces) 的 codespace 列表中，
    单击要停止的 codespace 右侧的省略号 (…)，然后单击“停止 codespace” 。
  - VS Code：打开 Visual Studio Code Command Palette  例如，按 `Ctrl+Shift+P` (Windows/Linux) 或 S`hift+Command+P` (Mac),  
    键入 `Codespaces: stop`，然后按 `Enter`。
  - 终端窗口：使用 GitHub CLI 命令 `gh codespace stop`。

  如果在未运行停止命令的情况下退出 codespace（例如，关闭浏览器选项卡），或者让 codespace 在没有交互的情况下运行，  
  则代码空间及其正在运行的进程将在非活动超时期限内继续运行。  

  关闭或停止代码空间时，将保留所有未提交的更改，直到您再次连接到代码空间。  

# 运行应用程序
  通过端口转发，您可以访问在代码空间内运行的 TCP 端口。   
  例如，如果要在代码空间内的端口 4000 上运行 Web 应用程序，则可以自动转发该端口，以使该应用程序可从浏览器访问。  

  端口转发确定可从远程计算机访问哪些端口。 即使不转发端口，在代码空间本身内运行的其他进程仍然可以访问该端口。  

  <img width="1440" height="1006" alt="image" src="https://github.com/user-attachments/assets/09506fcb-6d78-4cb2-95de-677140777be0" />

  当在 GitHub Codespaces 内运行的应用程序将端口输出到控制台时，GitHub Codespaces 会检测 localhost URL 模式并自动转发该端口。   
  可以单击终端中的 URL，或单击 VS Code 右下角弹出的“toast”通知消息中的链接在浏览器中打开端口。  
  默认情况下，GitHub Codespaces 使用 HTTP 转发端口。 有关端口转发的详细信息，请参阅 [代码空间中的转发端口](https://docs.github.com/zh/codespaces/developing-in-a-codespace/forwarding-ports-in-your-codespace)。  
  
  虽然端口可以自动转发，但它们不能被互联网公开访问。   
  默认情况下，所有端口都是私有的，但您可以手动使端口可供您的组织或公共使用，然后通过 URL 共享访问权限。  

  首次登录代码空间时运行应用程序可以实现快速的内部开发循环。 编辑时，您的更改会自动保存，并可在转发的端口上使用。   
  要查看更改，请返回浏览器中正在运行的应用程序选项卡并刷新它。  

# 提交和推送更改
  默认情况下，Git 安装在 codespace 中，因此你可以依赖现有的 Git 工作流。 你可以通过终端或者使用 VS Code 的源代码管理功能在 codespace 中使用 Git。  

  如果使用的是现有存储库，则可使用项目中的任何分支、提交或拉取请求创建 codespace，也可以从活动 codespace 中切换到新的或现有的分支。  
  由于 GitHub Codespaces 设计为临时的，因此你可以将其用作隔离环境来试验、检查团队成员的拉取请求或修复合并冲突。  

  如果仅对存储库具有读取权限，则可以为存储库创建 codespace，前提是可以创建该存储库的分支。  
  从 codespace 进行提交或推送到新分支时，GitHub Codespaces 会自动创建存储库分支，  
  或者将 codespace 链接到现有分支（如果你已为上游存储库创建一个分支）。  

  如果使用的是通过模板创建的 codespace，则默认情况下将安装 Git，但需要将 codespace 发布到远程存储库，以保留工作并与其他人共享。  
  如果通过 GitHub 的空白模板开始，则首先需要将工作区初始化为 Git 存储库（例如输入` git init`），才能在 codespace 中开始使用源代码管理功能。  

  > [!NOTE]
  > 来自 codespace 的提交将属性化为在 https://github.com/settings/profile
  > 配置的名称和公共电子邮件。
  > 范围限定为存储库的令牌（作为 GITHUB_TOKEN 包含在环境中），你的 GitHub 凭据将用于身份验证。

# 使用扩展个性化您的代码空间
  可以在 codespace 中添加扩展，对在 VS Code 中的体验进行个性化设置  

## VS Code 扩展
  如果在 VS Code 桌面应用程序或 Web 客户端中使用 codespace，则可使用 Visual Studio Code Marketplace 添加所需的任何扩展。  

  如果你已使用 VS Code，则可以使用[设置同步](https://code.visualstudio.com/docs/editor/settings-sync)在本地实例和你创建的任何 codespace 之间自动同步扩展、设置、主题和键盘快捷方式。  

# 关于 codespace 的目录结构
  创建 codespace 时，存储库将克隆到 codespace 的 /workspaces 目录中。   
  这是装载到容器中的永久性目录。   
  停止和启动 codespace 以及在 codespace 中重新生成容器时，将保留在此目录中所做的任何更改（包括编辑、添加或删除文件）。  

  在 /workspaces 目录外，codespace 包含 Linux 目录结构，该结构因用于生成 codespace 的开发容器映像而异。   
  可以添加文件或对 /workspaces 目录外部的文件进行更改。 例如，可以安装新程序，也可以在文件（如 ~/.bashrc）中设置 shell 配置。  
  作为非根用户，你可能不会自动拥有对某些目录的写入访问权限，但大多数映像允许使用 sudo 命令对这些目录进行根访问。  

  在 /workspaces 外，除 /tmp 目录，codespace 中的目录都与容器的生命周期相关联。  
  这意味着在停止和启动 codespace 时，所做的任何更改都将保留，但在重新生成容器时则不会保留。  

  清除 /workspaces 外部的目录有助于确保重新生成的容器的状态与新创建的 codespace 中的容器状态相同。  
  如果要重新生成容器以将配置更改应用于正在使用的 codespace，则可以确信，对于使用相同配置创建新 codespace 的用户而言，所做的任何配置更改都是相同的。  

  如果要对 codespace 进行更改，使其在重新生成和跨不同 codespace 时更加可靠，则你可以使用多种选项。  
  - 要在从存储库创建的所有 codespace 中安装程序和工具，在开发容器配置中，可以使用生命周期命令属性（例如 `postCreateCommand`）来运行自定义安装命令，
    也可以从名为“features”的预先编写的安装命令中进行选择。 有关详细信息，请参阅开发容器网站上的[开发容器规范](https://containers.dev/implementors/json_reference/#lifecycle-scripts)和 [向 devcontainer.json 文件添加功能](https://docs.github.com/zh/codespaces/setting-up-your-project-for-codespaces/configuring-dev-containers/adding-features-to-a-devcontainer-file)。
  - 要在创建的每个 codespace 中安装工具或自定义设置（例如配置你的 `bash` 配置文件），可以将 GitHub Codespaces 与点文件存储库链接。
    点文件存储库也将克隆到永久性` /workspaces` 目录中。 有关详细信息，请参阅“[个性化你帐户的 GitHub Codespaces](https://docs.github.com/zh/codespaces/setting-your-user-preferences/personalizing-github-codespaces-for-your-account#dotfiles)”。
  - 如果要在重新生成过程中保留特定文件，则可以使用 `devcontainer.json `文件在文件和` /workspaces` 中的永久性目录之间创建符号链接。
    
