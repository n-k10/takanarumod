# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 16: 鉱石をワールドに生成しよう

このステップでは、銀鉱石がワールド生成時に自然にスポーンするようにします。
新しいワールドを作ると、洞窟で銀鉱石を見つけられるようになります！

### やること
- `configured_feature`（鉱石の種類と鉱脈サイズを定義）
- `placed_feature`（生成される高さや頻度を定義）
- `forge/biome_modifier`（オーバーワールドの全バイオームに追加）

### 追加するファイル
| ファイル | 種類 |
|---------|------|
| [`src/main/resources/data/takanarumod/worldgen/configured_feature/silver_ore.json`](src/main/resources/data/takanarumod/worldgen/configured_feature/silver_ore.json) | 新規 |
| [`src/main/resources/data/takanarumod/worldgen/placed_feature/silver_ore_placed.json`](src/main/resources/data/takanarumod/worldgen/placed_feature/silver_ore_placed.json) | 新規 |
| [`src/main/resources/data/takanarumod/forge/biome_modifier/add_silver_ore.json`](src/main/resources/data/takanarumod/forge/biome_modifier/add_silver_ore.json) | 新規 |

### テクスチャ
このステップでは新しいテクスチャは不要です。

### 確認方法
新しいワールドを作成して洞窟を探検すると、Y=-24〜56の高さに銀鉱石が生成されています。
（既存のワールドでは新しいチャンクにのみ生成されます）
