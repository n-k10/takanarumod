# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 20: 特殊アイテムを作ろう

このステップでは、右クリックで近くの銀鉱石を探知する「銀の探知機」を追加します。
半径5ブロック以内に銀鉱石があると座標を表示します。

### やること
- `SilverDetectorItem.java` を作成して `use()` メソッドをオーバーライドする
- 周囲のブロックをスキャンして銀鉱石を探す
- 結果をチャットメッセージで表示する
- クールダウン（2秒）を設定する

### 追加・編集するファイル
| ファイル | 種類 |
|---------|------|
| `src/main/java/tech/takanaru/tutorialmod/item/SilverDetectorItem.java` | 新規 |
| `src/main/java/tech/takanaru/tutorialmod/item/ModItems.java` | 編集 |
| `src/main/java/tech/takanaru/tutorialmod/item/ModCreativeModTabs.java` | 編集 |
| `src/main/resources/assets/takanarumod/models/item/silver_detector.json` | 新規 |
| `src/main/resources/data/takanarumod/recipes/silver_detector.json` | 新規 |
| `src/main/resources/assets/takanarumod/lang/en_us.json` | 編集 |
| `src/main/resources/assets/takanarumod/lang/ja_jp.json` | 編集 |

### テクスチャ
以下のテクスチャを自分で描いて配置してください（16x16ピクセルのPNG）:
- `src/main/resources/assets/takanarumod/textures/item/silver_detector.png`
