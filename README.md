# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 07: 食べ物アイテムを追加しよう

このステップでは、食べられるアイテム「銀のリンゴ」を追加します。
食べると採掘速度上昇（Haste）と幸運（Luck）の効果がつきます。

### やること
- `ModItems.java` に `SILVER_APPLE` を追加（FoodPropertiesでエフェクト設定）
- クリエイティブタブに追加
- アイテムモデルJSON・レシピ・翻訳を追加

### 追加・編集するファイル
| ファイル | 種類 |
|---------|------|
| `src/main/java/tech/takanaru/tutorialmod/item/ModItems.java` | 編集 |
| `src/main/java/tech/takanaru/tutorialmod/item/ModCreativeModTabs.java` | 編集 |
| `src/main/resources/assets/takanarumod/models/item/silver_apple.json` | 新規 |
| `src/main/resources/data/takanarumod/recipes/silver_apple.json` | 新規 |
| `src/main/resources/assets/takanarumod/lang/en_us.json` | 編集 |
| `src/main/resources/assets/takanarumod/lang/ja_jp.json` | 編集 |

### テクスチャ
以下のテクスチャを自分で描いて配置してください（16x16ピクセルのPNG）:
- `src/main/resources/assets/takanarumod/textures/item/silver_apple.png`
