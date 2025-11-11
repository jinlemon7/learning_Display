# 创建关系图
  可以使用以下四种不同的语法在 Markdown 中创建关系图：mermaid、geoJSON、topoJSON 和 ASCII STL。  
  关系图可在以下项中呈现：GitHub Issues、GitHub Discussions、拉取请求、Wiki 和 Markdown 文件。  
## 创建 Mermaid 关系图
  Mermaid 是一款受 Markdown 启发的工具，可将文本呈现为关系图。 例如，Mermaid 可以呈现流程图、序列图、饼图等。 有关详细信息，请参阅 [Mermaid 文档](https://mermaid-js.github.io/mermaid/#/)。  
  若要创建 Mermaid 关系图，请使用 mermaid 语言标识符在围栏代码块中添加 Mermaid 语法。  

  例如，可以通过指定值和箭头来创建流程图。  
  ````
  Here is a simple flow chart:
  
  ```mermaid
  graph TD;
      A-->B;
      A-->C;
      B-->D;
      C-->D;
  ```
  ````
  <img width="1440" height="716" alt="image" src="https://github.com/user-attachments/assets/d24bbb95-97b1-4794-9702-90ada02154a6" />

  如果在 GitHub 上使用 Mermaid 语法时运行第三方 Mermaid 插件，你可能会发现出错。  
### 检查 Mermaid 的版本
  若要确保 GitHub 支持 Mermaid 语法，请检查当前正在使用的 Mermaid 版本。  
  ````
  ```mermaid
    info
  ```
  ````
## 创建 GeoJSON 和 TopoJSON 地图
  可使用 GeoJSON 或 TopoJSON 语法创建交互式地图。 若要创建地图，请使用 geojson 或 topojson 语法标识符在围栏代码块中添加 GeoJSON 或 TopoJSON。
### 使用 GeoJSON
  例如，可以通过指定坐标来创建地图。  
  ````
  ```geojson
  {
    "type": "FeatureCollection",
    "features": [
      {
        "type": "Feature",
        "id": 1,
        "properties": {
          "ID": 0
        },
        "geometry": {
          "type": "Polygon",
          "coordinates": [
            [
                [-90,35],
                [-90,30],
                [-85,30],
                [-85,35],
                [-90,35]
            ]
          ]
        }
      }
    ]
  }
  ```
  ````
  <img width="1440" height="1007" alt="image" src="https://github.com/user-attachments/assets/a12c1e7c-41eb-449a-93ae-ad3cddbf01bc" />

### 使用 TopoJSON
  例如，可以通过指定坐标和形状来创建 TopoJSON 地图.  
  ````
  ```topojson
  {
    "type": "Topology",
    "transform": {
      "scale": [0.0005000500050005, 0.00010001000100010001],
      "translate": [100, 0]
    },
    "objects": {
      "example": {
        "type": "GeometryCollection",
        "geometries": [
          {
            "type": "Point",
            "properties": {"prop0": "value0"},
            "coordinates": [4000, 5000]
          },
          {
            "type": "LineString",
            "properties": {"prop0": "value0", "prop1": 0},
            "arcs": [0]
          },
          {
            "type": "Polygon",
            "properties": {"prop0": "value0",
              "prop1": {"this": "that"}
            },
            "arcs": [[1]]
          }
        ]
      }
    },
    "arcs": [[[4000, 0], [1999, 9999], [2000, -9999], [2000, 9999]],[[0, 0], [0, 9999], [2000, 0], [0, -9999], [-2000, 0]]]
  }
  ```
  ````
  <img width="1440" height="1013" alt="image" src="https://github.com/user-attachments/assets/3c899640-6b3f-4cd5-89eb-534a4a978ae5" />

  有关使用 .geojson 和 .topojson 文件的详细信息，请参阅“[使用非代码文件](https://docs.github.com/zh/repositories/working-with-files/using-files/working-with-non-code-files#mapping-geojson-files-on-github)”。
## 创建 STL 3D 模型
  可以直接在 Markdown 中使用 ASCII STL 语法来创建交互式 3D 模型。 若要显示模型，请使用 stl 语法标识符在围栏代码块中添加 ASCII STL 语法。  

  例如，可创建简单的 3D 模型：  
  ````
  ```stl
  solid cube_corner
    facet normal 0.0 -1.0 0.0
      outer loop
        vertex 0.0 0.0 0.0
        vertex 1.0 0.0 0.0
        vertex 0.0 0.0 1.0
      endloop
    endfacet
    facet normal 0.0 0.0 -1.0
      outer loop
        vertex 0.0 0.0 0.0
        vertex 0.0 1.0 0.0
        vertex 1.0 0.0 0.0
      endloop
    endfacet
    facet normal -1.0 0.0 0.0
      outer loop
        vertex 0.0 0.0 0.0
        vertex 0.0 0.0 1.0
        vertex 0.0 1.0 0.0
      endloop
    endfacet
    facet normal 0.577 0.577 0.577
      outer loop
        vertex 1.0 0.0 0.0
        vertex 0.0 1.0 0.0
        vertex 0.0 0.0 1.0
      endloop
    endfacet
  endsolid
  ```
  ````
  <img width="1440" height="1076" alt="image" src="https://github.com/user-attachments/assets/e394d5f3-253e-4a33-8b74-6c9e0f8779a6" />

  有关使用 .stl 文件的详细信息，请参阅“[使用非代码文件](https://docs.github.com/zh/repositories/working-with-files/using-files/working-with-non-code-files#3d-file-viewer)”。

# 编写数学表达式
  为了实现数学表达式的清晰传达，GitHub 支持 Markdown 中 LaTeX 格式的数学表达式。 有关详细信息，请参阅 Wikibook 中的 [LaTeX/数学](http://en.wikibooks.org/wiki/LaTeX/Mathematics)。  
  GitHub 的数学呈现功能使用 MathJax；真是一种基于 JavaScript 的开源显示引擎。 MathJax 支持广泛的 LaTeX 宏，以及几个有用的辅助功能扩展。  
  有关详细信息，请参阅 [MathJax 文档](http://docs.mathjax.org/en/latest/input/tex/index.html#tex-and-latex-support)和 [MathJax 辅助功能扩展文档](https://mathjax.github.io/MathJax-a11y/docs/#reader-guide)。  

  数学表达式可在以下项中呈现：GitHub Issues、GitHub Discussions、拉取请求、Wiki 和 Markdown 文件。  
## 编写内联表达式
  有两个选项可用于将内嵌在文本中的数学表达式分隔出来。 可以使用美元符号 ($) 将表达式括起来，  
  或者以在表达式开头使用 ``` $` ``` ，并在其末尾使用  ``` `$ ``` 。 当正在编写的表达式包含与 markdown 语法重叠的字符时，后一种语法很有用。  
  ```
  This sentence uses `$` delimiters to show math inline: $\sqrt{3x-1}+(1+x)^2$
  ```
  <img width="1172" height="58" alt="image" src="https://github.com/user-attachments/assets/898be598-4be6-4f73-a6f6-63194bbfe420" />

  ```
  This sentence uses $\` and \`$ delimiters to show math inline: $`\sqrt{3x-1}+(1+x)^2`$
  ```
  <img width="1326" height="58" alt="image" src="https://github.com/user-attachments/assets/72c05633-d92e-43cd-b453-73eaf9a0582d" />
  
## 将表达式编写为块
  要以块的形式添加数学表达式，请启动一个新行，并使用两个美元符号 $$ 分隔表达式。  
  如果在 .md 文件中写入内容，将需要使用特定格式创建换行符，例如在行末尾添加反斜杠，如下方示例所示。   
  ```
    **The Cauchy-Schwarz Inequality**\
    $$\left( \sum_{k=1}^n a_k b_k \right)^2 \leq \left( \sum_{k=1}^n a_k^2 \right) \left( \sum_{k=1}^n b_k^2 \right)$$
  ```
  <img width="936" height="128" alt="image" src="https://github.com/user-attachments/assets/062013a7-4ba4-479f-8f74-08478719832d" />

  或者，可以使用 ```` ```math ```` 代码块语法将数学表达式显示为块。 使用此语法时，无需使用 $$ 分隔符。  
  ````
  **The Cauchy-Schwarz Inequality**
  
  ```math
  \left( \sum_{k=1}^n a_k b_k \right)^2 \leq \left( \sum_{k=1}^n a_k^2 \right) \left( \sum_{k=1}^n b_k^2 \right)
  ```
  ````
## 在数学表达式所在的行中和数学表达式内编写美元符号
  - 在数学表达式所在的同一行中将美元符号显示为字符，需要对非分隔符 $ 进行转义以确保行正确呈现。  
    ```
    This expression uses `\$` to display a dollar sign: $`\sqrt{\$4}`$
    ```
    <img width="1440" height="99" alt="image" src="https://github.com/user-attachments/assets/857b81cb-6364-4962-ad12-1b10ebd30f22" />
    
  - 在数学表达式之外，但在同一行上，在显式 $ 两边使用 span 标记。
    ```
    To split <span>$</span>100 in half, we calculate $100/2$
    ```
    <img width="1440" height="86" alt="image" src="https://github.com/user-attachments/assets/8abdacf2-3538-4a3c-a72a-765e7aab6596" />

# 自动链接引用和 URL
  自动链接引用： 自动生成文字引用并将URL与文字关联。  
## URL
  GitHub 通过标准 URL 自动创建链接。  
  `Visit https://github.com`
  <img width="1440" height="75" alt="image" src="https://github.com/user-attachments/assets/959301c8-15d6-4b5b-bbb1-408a611b81f8" />

## 议题和拉取请求
  在 GitHub 上的对话中，对议题和拉取请求的引用将自动转换为短链接。  
  在存储库的 wiki 或文件中没有创建自动链接的引用。  
  | 引用类型 | 原始引用 | 短链接 |  
  | --- | --- | --- |  
  | 问题或拉取请求 URL | `https://github.com/jlord/sheetsee.js/issues/26` | [#26](https://github.com/jlord/sheetsee.js/issues/26) |  
  | `#` 和问题或拉取请求编号 | #26 | [#26](https://github.com/jlord/sheetsee.js/issues/26) |  
  | `GH-` 和问题或拉取请求编号 | GH-26 | [GH-26](https://github.com/jlord/sheetsee.js/issues/26) |  
  | Username/Repository# 和问题或拉取请求编号 | jlord/sheetsee.js#26 | [jlord/sheetsee.js#26](https://github.com/jlord/sheetsee.js/issues/26) |  
  | Organization_name/Repository# 和问题或拉取请求编号 | github-linguist/linguist#4039 | [github-linguist/linguist#4039](https://github.com/github-linguist/linguist/pull/4039) |  
  
  如果在列表中引用问题、拉取请求或讨论，则引用将展开以显示标题和状态。  
## 标签
  在 Markdown 中引用标签的 URL 时，标签会自动呈现。 仅呈现同一存储库的标签，指向不同存储库标签的 URL 将呈现为任何 URL。  
  通过导航到标签页并单击标签，可找到标签的 URL。 例如，公共文档存储库中标签“增强”的 URL 为  
  `https://github.com/github/docs/labels/enhancement`  
  如果标签名称包含句点 (.)，则标签不会从标签 URL 自动呈现。  
## 提交 SHA
  对提交 SHA 哈希的引用会自动转换为指向 GitHub 上提交的短链接。  
  | 引用类型 | 原始引用 | 短链接 |  
  | --- | --- | --- |  
  | 提交 URL | `https://github.com/jlord/sheetsee.js/commit/a5c3785ed8d6a35868bc169f07e40e889087fd2e` | [a5c3785](https://github.com/jlord/sheetsee.js/commit/a5c3785ed8d6a35868bc169f07e40e889087fd2e) |  
  | SHA | a5c3785ed8d6a35868bc169f07e40e889087fd2e | [a5c3785](https://github.com/jlord/sheetsee.js/commit/a5c3785ed8d6a35868bc169f07e40e889087fd2e) |  
  | User@SHA | 	jlord@a5c3785ed8d6a35868bc169f07e40e889087fd2e | [jlord@a5c3785](https://github.com/jlord/sheetsee.js/commit/a5c3785ed8d6a35868bc169f07e40e889087fd2e) |  
  | Username/Repository@SHA | `jlord/sheetsee.js@a5c3785ed8d6a35868bc169f07e40e889087fd2e` | [`jlord/sheetsee.js@a5c3785`](https://github.com/jlord/sheetsee.js/commit/a5c3785ed8d6a35868bc169f07e40e889087fd2e) |  
##  引用提交 SHA 的故障排除
  从提交消息内部的专用存储库引用提交时，仅当提交的至少一个作者或提交者对所引用的提交具有读取访问权限时，提交 SHA 才会进行短链接。  
## 自定义外部资源的自动链接
  如果自定义自动链接引用配置用于仓库，则对外部资源（如 JIRA 议题或 Zendesk 事件单）的引用将转换为缩短的链接。   
  要了解在您的仓库中哪些自动链接可用，请联系拥有仓库管理员权限的人。 有关详细信息，请参阅“[配置自动链接以引用外部资源](https://docs.github.com/zh/repositories/managing-your-repositorys-settings-and-features/managing-repository-settings/configuring-autolinks-to-reference-external-resources)”。  
## 避免链接的引用的反向链接
  默认情况下，引用将生成反向链接。 例如，如果手动在拉取请求中链接到议题，则将自动在议题中生成反向链接到该拉取请求的另一个链接。   
  为避免此行为，在引用中构建 URL 时，可以使用 redirect.github.com 而不是 github.com。 如果在引用链接中使用 redirect.github.com URL，则在悬停时将不会显示弹出窗口。  

# 附加文件
  可通过将各种文件类型附加到议题和拉取请求来传达信息。  
  对于公共存储库，无需身份验证即可访问上传的文件。 对于专用和内部存储库，只有有权访问存储库的人才能查看上传的文件。  
  
  要将文件附加到议题或拉取请求对话，请将它拖放到评论框中。 或者，可以单击议题注释框下方的  浏览、选择并从计算机添加文件。  
  <img width="1440" height="429" alt="image" src="https://github.com/user-attachments/assets/d47c10cf-91f9-4960-a240-3ea2c497d592" />

  对于拉取请求，还可以单击拉取请求注释框上方格式栏中的 。  
  <img width="1440" height="448" alt="image" src="https://github.com/user-attachments/assets/6e2e79f4-f48c-4017-84e4-eb04d7c0bf79" />

  附加文件时，该文件会立即上传到 GitHub 并更新文本字段，以显示该文件的匿名 URL。 有关匿名化 URL 的详细信息，请参阅“[关于匿名化 URL](https://docs.github.com/zh/authentication/keeping-your-account-and-data-secure/about-anonymized-urls)”。  
  最大文件大小为：  
  - 10MB（对于图像和 gif）  
  - 10MB（对于上传到使用免费 GitHub 计划的用户或组织所拥有存储库的视频）  
  - 100 MB（对于上传到使用付费 GitHub 计划的用户或组织所拥有存储库的视频）
  - 25MB，对于所有其他文件
## 支持的文件类型
  所有上下文中都支持以下图像和媒体文件类型。  
### 图像和媒体文件
  - PNG (.png)  
  - GIF (.gif)  
  - JPEG (.jpg, .jpeg)  
  - SVG (.svg)  
  - 视频（.mp4、.mov、.webm）
    
  视频编解码器兼容性因浏览器而异，上传到一个浏览器的视频可能无法在另一个浏览器上查看。 目前，我们建议使用 H.264 实现最大兼容性。  
## 其他文件类型
  仓库的议题注释、拉取请求注释以及讨论注释中支持上传以下文件类型。 组织讨论中也支持此文件类型列表。  
### 文档
  - PDF (.pdf)  
  - Microsoft Office 文档（.docx、.pptx、.xlsx、.xls、.xlsm）  
  - OpenDocument 格式（.odt、.fodt、.ods、.fods、.odp、.fodp、.odg、.fodg、.odf）
  - 富文本和文字处理文件（.rtf、.doc）
### 文本和数据文件
  - 纯文本和标记（.txt、.md、.copilotmd）
  - 数据和表格文件（.csv、 .tsv、 .log、.json、.jsonc）
###　开发和代码文件
  - C 文件 (.c)  
  - C# 文件 (.cs)
  - C++ 文件 (.cpp)
  - CSS 文件 (.css)
  - 关系图 (.drawio)
  - 转储文件 (.dmp)
  - HTML 文件 (.html, .htm)
  - Java 文件 (.java)
  - JavaScript 文件 (.js)
  - Jupyter 笔记本 (.ipynb)
  - 修补文件 (.patch)
  - PHP 文件 (.php)
  - 分析文件 (.cpuprofile)
  - 项目数据库文件 (.pdb)
  - Python 文件 (.py)
  - Shell 脚本 (.sh)
  - SQL 文件 (.sql)
  - TypeScript 文件（.ts、.tsx）
  - XML 文件 (.xml)
  - YAML 文件（.yaml、.yml）

  如果使用 Linux 并尝试上传 .patch 文件，则将收到错误消息。 这是一个已知问题。  
### 存档和压缩文件
  - 存档和包（.zip、.gz、.tgz）
###　通信和日志
　- 文本和电子邮件文件（.debug、.msg、.eml）
### 映像
  - 位图与 TIFF 图像（.bmp、.tif、.tiff）
### 音频
  - 音频文件（.mp3、.wav）

# 任务列表
  你可以使用任务列表将议题或拉取请求的工作分解为较小的任务，然后跟踪要完成的整套工作。  
  任务列表块已处于“已停用”，使用子议题来替代任务列表块。  

# 创建指向代码段的永久链接
  您可以创建指向特定版本的文件或拉取请求中特定代码行或行范围的永久链接。  
## 链接到代码
  此类永久链接仅在其起源仓库中呈现为代码段。 在其他仓库中，永久链接代码段将呈现为 URL。 这不适用于 Markdown 文件，仅适用于注释。  
  <img width="1440" height="672" alt="image" src="https://github.com/user-attachments/assets/a3b9ccb6-b15f-4ae0-a07e-1e86d8d6a083" />

  若要为整个文件创建永久链接，请参阅“[创建文件的永久链接](https://docs.github.com/zh/repositories/working-with-files/using-files/getting-permanent-links-to-files)”。  
  1. 在 GitHub 上，导航到存储库的主页面。
  2. 找到要链接的代码：
      - 要链接到文件中的代码，请导航到该文件。
      - 若要从拉取请求链接到代码，请导航到拉取请求并单击 “Files changed”。 然后浏览到含有要包含在注释中的代码的文件，并单击“View”。
  3. 决定是选择一行还是一个范围。
      - 要选择单行代码，请单击行号以高亮显示该行。
      - 要选择代码范围，请单击范围内第一行的行号以高亮显示代码行。 然后，将鼠标停在代码范围的最后一行，按 Shift，再单击行号以突出显示范围。
  4. 在行或一系列行的左侧，单击 。 在下拉菜单中，单击“复制永久链接”。
      <img width="1440" height="370" alt="image" src="https://github.com/user-attachments/assets/89fe2c4f-cc9b-4f56-b699-ae80ce9a06b8" />
  5. 导航到要链接到代码段的对话。  
  6. 将永久链接粘贴到注释中，然后单击“注释”。  
## 链接到 Markdown
  您可以通过加载 Markdown 文件而不进行 Markdown 渲染来链接到 Markdown 文件中的特定行。 要在不呈现的情况下加载 Markdown 文件，可以在文件的 URL 末尾使用 `?plain=1` 参数。   
  例如，`github.com/<organization>/<repository>/blob/<commit_SHA>/README.md?plain=1`  

  您可以在代码中以同样的方式链接到 Markdown 文件中的特定行。 在 URL 末尾的行号处附加 `#L`。   
  例如，`github.com/<organization>/<repository>/blob/<commit_SHA>/README.md?plain=1#L14` 将在纯文本 README.md 文件中突出显示第 14 行。

# 在议题和拉取请求中使用关键字
  使用关键字链接议题和拉取请求，或将议题或拉取请求标记为重复。  
## 将拉取请求链接到议题
  要将拉取请求链接到问题以显示正在进行的修复，并且当有人合并拉取请求时自动关闭问题，请键入以下关键字之一，然后引用问题。 例如，`Closes #10` 或 `Fixes octo-org/octo-repo#100`。  
  - close
  - closes
  - closed
  - fix
  - fixes
  - fixed
  - resolve
  - resolves
  - resolved
## 将议题或拉取请求标记为重复
  要将议题或拉取请求标记为重复，请在新评论正文中输入 "Duplicate of"，后接它复制的议题或拉取请求编号。 有关详细信息，请参阅“[将议题或拉取请求标记为重复](https://docs.github.com/zh/issues/tracking-your-work-with-issues/marking-issues-or-pull-requests-as-a-duplicate)”。
