.class public Lc/g;
.super Lc/e;
.source ""

# interfaces
.implements Landroidx/appcompat/view/menu/e$a;
.implements Landroid/view/LayoutInflater$Factory2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/g$e;,
        Lc/g$g;,
        Lc/g$f;,
        Lc/g$d;,
        Lc/g$h;,
        Lc/g$i;,
        Lc/g$b;,
        Lc/g$j;,
        Lc/g$c;
    }
.end annotation


# static fields
.field public static final Z:Ll/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll/h<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final a0:[I

.field public static final b0:Z

.field public static final c0:Z


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public D:Z

.field public E:Z

.field public F:[Lc/g$i;

.field public G:Lc/g$i;

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:Z

.field public L:Z

.field public M:I

.field public N:I

.field public O:Z

.field public P:Z

.field public Q:Lc/g$f;

.field public R:Lc/g$f;

.field public S:Z

.field public T:I

.field public final U:Ljava/lang/Runnable;

.field public V:Z

.field public W:Landroid/graphics/Rect;

.field public X:Landroid/graphics/Rect;

.field public Y:Lc/m;

.field public final d:Ljava/lang/Object;

.field public final e:Landroid/content/Context;

.field public f:Landroid/view/Window;

.field public g:Lc/g$d;

.field public final h:Lc/d;

.field public i:Lc/a;

.field public j:Landroid/view/MenuInflater;

.field public k:Ljava/lang/CharSequence;

.field public l:Lh/b0;

.field public m:Lc/g$b;

.field public n:Lc/g$j;

.field public o:Lf/a;

.field public p:Landroidx/appcompat/widget/ActionBarContextView;

.field public q:Landroid/widget/PopupWindow;

.field public r:Ljava/lang/Runnable;

.field public s:Le0/o;

.field public t:Z

.field public u:Landroid/view/ViewGroup;

.field public v:Landroid/widget/TextView;

.field public w:Landroid/view/View;

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Ll/h;

    invoke-direct {v0}, Ll/h;-><init>()V

    sput-object v0, Lc/g;->Z:Ll/h;

    const/4 v0, 0x1

    new-array v1, v0, [I

    const v2, 0x1010054

    const/4 v3, 0x0

    aput v2, v1, v3

    sput-object v1, Lc/g;->a0:[I

    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    const-string v2, "robolectric"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    xor-int/2addr v1, v0

    sput-boolean v1, Lc/g;->b0:Z

    sput-boolean v0, Lc/g;->c0:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/Window;Lc/d;Ljava/lang/Object;)V
    .locals 3

    invoke-direct {p0}, Lc/e;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lc/g;->s:Le0/o;

    const/16 v1, -0x64

    iput v1, p0, Lc/g;->M:I

    new-instance v2, Lc/g$a;

    invoke-direct {v2, p0}, Lc/g$a;-><init>(Lc/g;)V

    iput-object v2, p0, Lc/g;->U:Ljava/lang/Runnable;

    iput-object p1, p0, Lc/g;->e:Landroid/content/Context;

    iput-object p3, p0, Lc/g;->h:Lc/d;

    iput-object p4, p0, Lc/g;->d:Ljava/lang/Object;

    instance-of p3, p4, Landroid/app/Dialog;

    if-eqz p3, :cond_2

    :goto_0
    if-eqz p1, :cond_1

    .line 1
    instance-of p3, p1, Lc/c;

    if-eqz p3, :cond_0

    check-cast p1, Lc/c;

    goto :goto_1

    :cond_0
    instance-of p3, p1, Landroid/content/ContextWrapper;

    if-eqz p3, :cond_1

    check-cast p1, Landroid/content/ContextWrapper;

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_1
    if-eqz p1, :cond_2

    .line 2
    invoke-virtual {p1}, Lc/c;->m()Lc/e;

    move-result-object p1

    invoke-virtual {p1}, Lc/e;->f()I

    move-result p1

    iput p1, p0, Lc/g;->M:I

    :cond_2
    iget p1, p0, Lc/g;->M:I

    if-ne p1, v1, :cond_3

    sget-object p1, Lc/g;->Z:Ll/h;

    iget-object p3, p0, Lc/g;->d:Ljava/lang/Object;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    .line 3
    invoke-virtual {p1, p3, v0}, Ll/h;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    .line 4
    check-cast p3, Ljava/lang/Integer;

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iput p3, p0, Lc/g;->M:I

    iget-object p3, p0, Lc/g;->d:Ljava/lang/Object;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ll/h;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    if-eqz p2, :cond_4

    invoke-virtual {p0, p2}, Lc/g;->B(Landroid/view/Window;)V

    :cond_4
    invoke-static {}, Lh/i;->e()V

    return-void
.end method


# virtual methods
.method public final A(Z)Z
    .locals 18

    move-object/from16 v1, p0

    iget-boolean v0, v1, Lc/g;->L:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    return v2

    .line 1
    :cond_0
    iget v0, v1, Lc/g;->M:I

    const/16 v3, -0x64

    if-eq v0, v3, :cond_1

    move v3, v0

    .line 2
    :cond_1
    iget-object v0, v1, Lc/g;->e:Landroid/content/Context;

    invoke-virtual {v1, v0, v3}, Lc/g;->R(Landroid/content/Context;I)I

    move-result v0

    .line 3
    iget-object v4, v1, Lc/g;->e:Landroid/content/Context;

    const/4 v5, 0x0

    invoke-virtual {v1, v4, v0, v5}, Lc/g;->F(Landroid/content/Context;ILandroid/content/res/Configuration;)Landroid/content/res/Configuration;

    move-result-object v4

    .line 4
    iget-boolean v0, v1, Lc/g;->P:Z

    const/4 v6, 0x1

    if-nez v0, :cond_5

    iget-object v0, v1, Lc/g;->d:Ljava/lang/Object;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_5

    iget-object v0, v1, Lc/g;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    if-nez v0, :cond_2

    move v7, v2

    goto :goto_3

    :cond_2
    :try_start_0
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x1d

    if-lt v7, v8, :cond_3

    const/high16 v7, 0x100c0000

    goto :goto_0

    :cond_3
    const/high16 v7, 0xc0000

    :goto_0
    new-instance v8, Landroid/content/ComponentName;

    iget-object v9, v1, Lc/g;->e:Landroid/content/Context;

    iget-object v10, v1, Lc/g;->d:Ljava/lang/Object;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    invoke-direct {v8, v9, v10}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v8, v7}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v0

    if-eqz v0, :cond_4

    iget v0, v0, Landroid/content/pm/ActivityInfo;->configChanges:I

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_4

    move v0, v6

    goto :goto_1

    :cond_4
    move v0, v2

    :goto_1
    iput-boolean v0, v1, Lc/g;->O:Z
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    const-string v7, "AppCompatDelegate"

    const-string v8, "Exception while getting ActivityInfo"

    invoke-static {v7, v8, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-boolean v2, v1, Lc/g;->O:Z

    :cond_5
    :goto_2
    iput-boolean v6, v1, Lc/g;->P:Z

    iget-boolean v0, v1, Lc/g;->O:Z

    move v7, v0

    .line 5
    :goto_3
    iget-object v0, v1, Lc/g;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v8, v0, 0x30

    iget v0, v4, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v4, v0, 0x30

    const/16 v10, 0x1c

    if-eq v8, v4, :cond_f

    if-eqz p1, :cond_f

    if-nez v7, :cond_f

    iget-boolean v0, v1, Lc/g;->I:Z

    if-eqz v0, :cond_f

    sget-boolean v0, Lc/g;->b0:Z

    if-nez v0, :cond_6

    iget-boolean v0, v1, Lc/g;->J:Z

    if-eqz v0, :cond_f

    :cond_6
    iget-object v0, v1, Lc/g;->d:Ljava/lang/Object;

    instance-of v11, v0, Landroid/app/Activity;

    if-eqz v11, :cond_f

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isChild()Z

    move-result v0

    if-nez v0, :cond_f

    iget-object v0, v1, Lc/g;->d:Ljava/lang/Object;

    move-object v11, v0

    check-cast v11, Landroid/app/Activity;

    sget v0, Lu/a;->b:I

    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v10, :cond_7

    goto/16 :goto_8

    :cond_7
    sget-object v12, Lu/e;->a:Ljava/lang/Class;

    if-lt v0, v10, :cond_8

    .line 7
    invoke-virtual {v11}, Landroid/app/Activity;->recreate()V

    goto/16 :goto_5

    :cond_8
    invoke-static {}, Lu/e;->a()Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, Lu/e;->f:Ljava/lang/reflect/Method;

    if-nez v0, :cond_9

    goto/16 :goto_6

    :cond_9
    sget-object v0, Lu/e;->e:Ljava/lang/reflect/Method;

    if-nez v0, :cond_a

    sget-object v0, Lu/e;->d:Ljava/lang/reflect/Method;

    if-nez v0, :cond_a

    goto/16 :goto_6

    :cond_a
    :try_start_1
    sget-object v0, Lu/e;->c:Ljava/lang/reflect/Field;

    invoke-virtual {v0, v11}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_b

    goto :goto_6

    :cond_b
    sget-object v12, Lu/e;->b:Ljava/lang/reflect/Field;

    invoke-virtual {v12, v11}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_c

    goto :goto_6

    :cond_c
    invoke-virtual {v11}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v13

    new-instance v14, Lu/e$a;

    invoke-direct {v14, v11}, Lu/e$a;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v13, v14}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    sget-object v15, Lu/e;->g:Landroid/os/Handler;

    new-instance v10, Lu/b;

    invoke-direct {v10, v14, v0}, Lu/b;-><init>(Lu/e$a;Ljava/lang/Object;)V

    invoke-virtual {v15, v10}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {}, Lu/e;->a()Z

    move-result v10

    if-eqz v10, :cond_d

    sget-object v10, Lu/e;->f:Ljava/lang/reflect/Method;

    const/16 v9, 0x9

    new-array v9, v9, [Ljava/lang/Object;

    aput-object v0, v9, v2

    aput-object v5, v9, v6

    const/4 v0, 0x2

    aput-object v5, v9, v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v16, 0x3

    aput-object v0, v9, v16

    const/4 v0, 0x4

    sget-object v17, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v17, v9, v0

    const/4 v0, 0x5

    aput-object v5, v9, v0

    const/4 v0, 0x6

    aput-object v5, v9, v0

    const/4 v0, 0x7

    aput-object v17, v9, v0

    const/16 v0, 0x8

    aput-object v17, v9, v0

    invoke-virtual {v10, v12, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_d
    invoke-virtual {v11}, Landroid/app/Activity;->recreate()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_4
    :try_start_3
    new-instance v0, Lu/c;

    invoke-direct {v0, v13, v14}, Lu/c;-><init>(Landroid/app/Application;Lu/e$a;)V

    invoke-virtual {v15, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_5
    move v0, v6

    goto :goto_7

    :catchall_0
    move-exception v0

    sget-object v9, Lu/e;->g:Landroid/os/Handler;

    new-instance v10, Lu/c;

    invoke-direct {v10, v13, v14}, Lu/c;-><init>(Landroid/app/Application;Lu/e$a;)V

    invoke-virtual {v9, v10}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    :goto_6
    move v0, v2

    :goto_7
    if-nez v0, :cond_e

    .line 8
    :goto_8
    invoke-virtual {v11}, Landroid/app/Activity;->recreate()V

    :cond_e
    move v0, v6

    goto :goto_9

    :cond_f
    move v0, v2

    :goto_9
    if-nez v0, :cond_1a

    if-eq v8, v4, :cond_1a

    .line 9
    iget-object v0, v1, Lc/g;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    new-instance v9, Landroid/content/res/Configuration;

    invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-direct {v9, v0}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v0, v0, -0x31

    or-int/2addr v0, v4

    iput v0, v9, Landroid/content/res/Configuration;->uiMode:I

    invoke-virtual {v8, v9, v5}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1a

    if-ge v0, v4, :cond_16

    const/16 v4, 0x1c

    if-lt v0, v4, :cond_10

    goto/16 :goto_e

    .line 10
    :cond_10
    sget-boolean v0, Lc/n;->h:Z

    const-string v4, "ResourcesFlusher"

    if-nez v0, :cond_11

    :try_start_4
    const-class v0, Landroid/content/res/Resources;

    const-string v10, "mResourcesImpl"

    invoke-virtual {v0, v10}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Lc/n;->g:Ljava/lang/reflect/Field;

    invoke-virtual {v0, v6}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_4
    .catch Ljava/lang/NoSuchFieldException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_a

    :catch_1
    move-exception v0

    const-string v10, "Could not retrieve Resources#mResourcesImpl field"

    invoke-static {v4, v10, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_a
    sput-boolean v6, Lc/n;->h:Z

    :cond_11
    sget-object v0, Lc/n;->g:Ljava/lang/reflect/Field;

    if-nez v0, :cond_12

    goto :goto_e

    :cond_12
    :try_start_5
    invoke-virtual {v0, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_5 .. :try_end_5} :catch_2

    move-object v8, v0

    goto :goto_b

    :catch_2
    move-exception v0

    move-object v8, v0

    const-string v0, "Could not retrieve value from Resources#mResourcesImpl"

    invoke-static {v4, v0, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object v8, v5

    :goto_b
    if-nez v8, :cond_13

    goto :goto_e

    :cond_13
    sget-boolean v0, Lc/n;->b:Z

    if-nez v0, :cond_14

    :try_start_6
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v10, "mDrawableCache"

    invoke-virtual {v0, v10}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Lc/n;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v0, v6}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_6
    .catch Ljava/lang/NoSuchFieldException; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_c

    :catch_3
    move-exception v0

    const-string v10, "Could not retrieve ResourcesImpl#mDrawableCache field"

    invoke-static {v4, v10, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_c
    sput-boolean v6, Lc/n;->b:Z

    :cond_14
    sget-object v0, Lc/n;->a:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_15

    :try_start_7
    invoke-virtual {v0, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_7} :catch_4

    goto :goto_d

    :catch_4
    move-exception v0

    move-object v8, v0

    const-string v0, "Could not retrieve value from ResourcesImpl#mDrawableCache"

    invoke-static {v4, v0, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_15
    :goto_d
    if-eqz v5, :cond_16

    invoke-static {v5}, Lc/n;->a(Ljava/lang/Object;)V

    .line 11
    :cond_16
    :goto_e
    iget v0, v1, Lc/g;->N:I

    if-eqz v0, :cond_17

    iget-object v4, v1, Lc/g;->e:Landroid/content/Context;

    invoke-virtual {v4, v0}, Landroid/content/Context;->setTheme(I)V

    iget-object v0, v1, Lc/g;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    iget v4, v1, Lc/g;->N:I

    invoke-virtual {v0, v4, v6}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_17
    if-eqz v7, :cond_1b

    iget-object v0, v1, Lc/g;->d:Ljava/lang/Object;

    instance-of v4, v0, Landroid/app/Activity;

    if-eqz v4, :cond_1b

    check-cast v0, Landroid/app/Activity;

    instance-of v4, v0, Lm0/c;

    if-eqz v4, :cond_19

    move-object v4, v0

    check-cast v4, Lm0/c;

    invoke-interface {v4}, Lm0/c;->a()Landroidx/lifecycle/c;

    move-result-object v4

    check-cast v4, Landroidx/lifecycle/e;

    .line 12
    iget-object v4, v4, Landroidx/lifecycle/e;->b:Landroidx/lifecycle/c$b;

    .line 13
    sget-object v5, Landroidx/lifecycle/c$b;->d:Landroidx/lifecycle/c$b;

    .line 14
    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-ltz v4, :cond_18

    move v2, v6

    :cond_18
    if-eqz v2, :cond_1b

    goto :goto_f

    .line 15
    :cond_19
    iget-boolean v2, v1, Lc/g;->K:Z

    if-eqz v2, :cond_1b

    :goto_f
    invoke-virtual {v0, v9}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    goto :goto_10

    :cond_1a
    move v6, v0

    :cond_1b
    :goto_10
    if-eqz v6, :cond_1c

    .line 16
    iget-object v0, v1, Lc/g;->d:Ljava/lang/Object;

    instance-of v2, v0, Lc/c;

    if-eqz v2, :cond_1c

    check-cast v0, Lc/c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1c
    if-nez v3, :cond_1d

    .line 17
    iget-object v0, v1, Lc/g;->e:Landroid/content/Context;

    invoke-virtual {v1, v0}, Lc/g;->M(Landroid/content/Context;)Lc/g$f;

    move-result-object v0

    invoke-virtual {v0}, Lc/g$f;->e()V

    goto :goto_11

    :cond_1d
    iget-object v0, v1, Lc/g;->Q:Lc/g$f;

    if-eqz v0, :cond_1e

    invoke-virtual {v0}, Lc/g$f;->a()V

    :cond_1e
    :goto_11
    const/4 v2, 0x3

    if-ne v3, v2, :cond_20

    iget-object v0, v1, Lc/g;->e:Landroid/content/Context;

    .line 18
    iget-object v2, v1, Lc/g;->R:Lc/g$f;

    if-nez v2, :cond_1f

    new-instance v2, Lc/g$e;

    invoke-direct {v2, v1, v0}, Lc/g$e;-><init>(Lc/g;Landroid/content/Context;)V

    iput-object v2, v1, Lc/g;->R:Lc/g$f;

    :cond_1f
    iget-object v0, v1, Lc/g;->R:Lc/g$f;

    .line 19
    invoke-virtual {v0}, Lc/g$f;->e()V

    goto :goto_12

    :cond_20
    iget-object v0, v1, Lc/g;->R:Lc/g$f;

    if-eqz v0, :cond_21

    invoke-virtual {v0}, Lc/g$f;->a()V

    :cond_21
    :goto_12
    return v6
.end method

.method public final B(Landroid/view/Window;)V
    .locals 3

    iget-object v0, p0, Lc/g;->f:Landroid/view/Window;

    const-string v1, "AppCompat has already installed itself into the Window"

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    instance-of v2, v0, Lc/g$d;

    if-nez v2, :cond_1

    new-instance v1, Lc/g$d;

    invoke-direct {v1, p0, v0}, Lc/g$d;-><init>(Lc/g;Landroid/view/Window$Callback;)V

    iput-object v1, p0, Lc/g;->g:Lc/g$d;

    invoke-virtual {p1, v1}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    iget-object v0, p0, Lc/g;->e:Landroid/content/Context;

    const/4 v1, 0x0

    sget-object v2, Lc/g;->a0:[I

    invoke-static {v0, v1, v2}, Lh/u0;->n(Landroid/content/Context;Landroid/util/AttributeSet;[I)Lh/u0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lh/u0;->f(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1
    :cond_0
    iget-object v0, v0, Lh/u0;->b:Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 2
    iput-object p1, p0, Lc/g;->f:Landroid/view/Window;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public C(ILc/g$i;Landroid/view/Menu;)V
    .locals 0

    if-nez p3, :cond_0

    iget-object p3, p2, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    :cond_0
    iget-boolean p2, p2, Lc/g$i;->m:Z

    if-nez p2, :cond_1

    return-void

    :cond_1
    iget-boolean p2, p0, Lc/g;->L:Z

    if-nez p2, :cond_2

    iget-object p2, p0, Lc/g;->g:Lc/g$d;

    .line 1
    iget-object p2, p2, Lf/i;->b:Landroid/view/Window$Callback;

    .line 2
    invoke-interface {p2, p1, p3}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    :cond_2
    return-void
.end method

.method public D(Landroidx/appcompat/view/menu/e;)V
    .locals 2

    iget-boolean v0, p0, Lc/g;->E:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lc/g;->E:Z

    iget-object v0, p0, Lc/g;->l:Lh/b0;

    invoke-interface {v0}, Lh/b0;->j()V

    invoke-virtual {p0}, Lc/g;->O()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lc/g;->L:Z

    if-nez v1, :cond_1

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    :cond_1
    const/4 p1, 0x0

    iput-boolean p1, p0, Lc/g;->E:Z

    return-void
.end method

.method public E(Lc/g$i;Z)V
    .locals 3

    if-eqz p2, :cond_0

    iget v0, p1, Lc/g$i;->a:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lc/g;->l:Lh/b0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lh/b0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    invoke-virtual {p0, p1}, Lc/g;->D(Landroidx/appcompat/view/menu/e;)V

    return-void

    :cond_0
    iget-object v0, p0, Lc/g;->e:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-boolean v2, p1, Lc/g$i;->m:Z

    if-eqz v2, :cond_1

    iget-object v2, p1, Lc/g$i;->e:Landroid/view/ViewGroup;

    if-eqz v2, :cond_1

    invoke-interface {v0, v2}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V

    if-eqz p2, :cond_1

    iget p2, p1, Lc/g$i;->a:I

    invoke-virtual {p0, p2, p1, v1}, Lc/g;->C(ILc/g$i;Landroid/view/Menu;)V

    :cond_1
    const/4 p2, 0x0

    iput-boolean p2, p1, Lc/g$i;->k:Z

    iput-boolean p2, p1, Lc/g$i;->l:Z

    iput-boolean p2, p1, Lc/g$i;->m:Z

    iput-object v1, p1, Lc/g$i;->f:Landroid/view/View;

    const/4 p2, 0x1

    iput-boolean p2, p1, Lc/g$i;->n:Z

    iget-object p2, p0, Lc/g;->G:Lc/g$i;

    if-ne p2, p1, :cond_2

    iput-object v1, p0, Lc/g;->G:Lc/g$i;

    :cond_2
    return-void
.end method

.method public final F(Landroid/content/Context;ILandroid/content/res/Configuration;)Landroid/content/res/Configuration;
    .locals 1

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p1, p1, 0x30

    goto :goto_0

    :cond_0
    const/16 p1, 0x20

    goto :goto_0

    :cond_1
    const/16 p1, 0x10

    :goto_0
    new-instance p2, Landroid/content/res/Configuration;

    invoke-direct {p2}, Landroid/content/res/Configuration;-><init>()V

    const/4 v0, 0x0

    iput v0, p2, Landroid/content/res/Configuration;->fontScale:F

    if-eqz p3, :cond_2

    invoke-virtual {p2, p3}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    :cond_2
    iget p3, p2, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p3, p3, -0x31

    or-int/2addr p1, p3

    iput p1, p2, Landroid/content/res/Configuration;->uiMode:I

    return-object p2
.end method

.method public G(Landroid/view/KeyEvent;)Z
    .locals 6

    iget-object v0, p0, Lc/g;->d:Ljava/lang/Object;

    instance-of v1, v0, Le0/d$a;

    const/4 v2, 0x1

    if-nez v1, :cond_0

    instance-of v0, v0, Lc/l;

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lc/g;->f:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0, p1}, Le0/d;->a(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x52

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lc/g;->g:Lc/g$d;

    .line 1
    iget-object v0, v0, Lf/i;->b:Landroid/view/Window$Callback;

    .line 2
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v2

    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_3

    move v3, v2

    goto :goto_0

    :cond_3
    move v3, v4

    :goto_0
    const/4 v5, 0x4

    if-eqz v3, :cond_8

    if-eq v0, v5, :cond_5

    if-eq v0, v1, :cond_4

    goto :goto_2

    .line 3
    :cond_4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_17

    invoke-virtual {p0, v4}, Lc/g;->N(I)Lc/g$i;

    move-result-object v0

    iget-boolean v1, v0, Lc/g$i;->m:Z

    if-nez v1, :cond_17

    invoke-virtual {p0, v0, p1}, Lc/g;->U(Lc/g$i;Landroid/view/KeyEvent;)Z

    goto/16 :goto_9

    .line 4
    :cond_5
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getFlags()I

    move-result p1

    and-int/lit16 p1, p1, 0x80

    if-eqz p1, :cond_6

    goto :goto_1

    :cond_6
    move v2, v4

    :goto_1
    iput-boolean v2, p0, Lc/g;->H:Z

    :cond_7
    :goto_2
    move v2, v4

    goto/16 :goto_9

    :cond_8
    if-eq v0, v5, :cond_12

    if-eq v0, v1, :cond_9

    goto :goto_2

    .line 5
    :cond_9
    iget-object v0, p0, Lc/g;->o:Lf/a;

    if-eqz v0, :cond_a

    goto/16 :goto_9

    :cond_a
    invoke-virtual {p0, v4}, Lc/g;->N(I)Lc/g$i;

    move-result-object v0

    iget-object v1, p0, Lc/g;->l:Lh/b0;

    if-eqz v1, :cond_c

    invoke-interface {v1}, Lh/b0;->f()Z

    move-result v1

    if-eqz v1, :cond_c

    iget-object v1, p0, Lc/g;->e:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result v1

    if-nez v1, :cond_c

    iget-object v1, p0, Lc/g;->l:Lh/b0;

    invoke-interface {v1}, Lh/b0;->e()Z

    move-result v1

    if-nez v1, :cond_b

    iget-boolean v1, p0, Lc/g;->L:Z

    if-nez v1, :cond_f

    invoke-virtual {p0, v0, p1}, Lc/g;->U(Lc/g$i;Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_f

    iget-object p1, p0, Lc/g;->l:Lh/b0;

    invoke-interface {p1}, Lh/b0;->a()Z

    move-result p1

    goto :goto_5

    :cond_b
    iget-object p1, p0, Lc/g;->l:Lh/b0;

    invoke-interface {p1}, Lh/b0;->g()Z

    move-result p1

    goto :goto_5

    :cond_c
    iget-boolean v1, v0, Lc/g$i;->m:Z

    if-nez v1, :cond_10

    iget-boolean v3, v0, Lc/g$i;->l:Z

    if-eqz v3, :cond_d

    goto :goto_4

    :cond_d
    iget-boolean v1, v0, Lc/g$i;->k:Z

    if-eqz v1, :cond_f

    iget-boolean v1, v0, Lc/g$i;->o:Z

    if-eqz v1, :cond_e

    iput-boolean v4, v0, Lc/g$i;->k:Z

    invoke-virtual {p0, v0, p1}, Lc/g;->U(Lc/g$i;Landroid/view/KeyEvent;)Z

    move-result v1

    goto :goto_3

    :cond_e
    move v1, v2

    :goto_3
    if-eqz v1, :cond_f

    invoke-virtual {p0, v0, p1}, Lc/g;->S(Lc/g$i;Landroid/view/KeyEvent;)V

    move p1, v2

    goto :goto_5

    :cond_f
    move p1, v4

    goto :goto_5

    :cond_10
    :goto_4
    invoke-virtual {p0, v0, v2}, Lc/g;->E(Lc/g$i;Z)V

    move p1, v1

    :goto_5
    if-eqz p1, :cond_17

    iget-object p1, p0, Lc/g;->e:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "audio"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    if-eqz p1, :cond_11

    invoke-virtual {p1, v4}, Landroid/media/AudioManager;->playSoundEffect(I)V

    goto :goto_9

    :cond_11
    const-string p1, "AppCompatDelegate"

    const-string v0, "Couldn\'t get audio manager"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_9

    .line 6
    :cond_12
    iget-boolean p1, p0, Lc/g;->H:Z

    iput-boolean v4, p0, Lc/g;->H:Z

    invoke-virtual {p0, v4}, Lc/g;->N(I)Lc/g$i;

    move-result-object v0

    iget-boolean v1, v0, Lc/g$i;->m:Z

    if-eqz v1, :cond_13

    if-nez p1, :cond_17

    invoke-virtual {p0, v0, v2}, Lc/g;->E(Lc/g$i;Z)V

    goto :goto_9

    .line 7
    :cond_13
    iget-object p1, p0, Lc/g;->o:Lf/a;

    if-eqz p1, :cond_14

    invoke-virtual {p1}, Lf/a;->c()V

    goto :goto_7

    .line 8
    :cond_14
    invoke-virtual {p0}, Lc/g;->P()V

    iget-object p1, p0, Lc/g;->i:Lc/a;

    if-eqz p1, :cond_16

    .line 9
    check-cast p1, Lc/q;

    .line 10
    iget-object v0, p1, Lc/q;->e:Lh/c0;

    if-eqz v0, :cond_15

    invoke-interface {v0}, Lh/c0;->m()Z

    move-result v0

    if-eqz v0, :cond_15

    iget-object p1, p1, Lc/q;->e:Lh/c0;

    invoke-interface {p1}, Lh/c0;->collapseActionView()V

    move p1, v2

    goto :goto_6

    :cond_15
    move p1, v4

    :goto_6
    if-eqz p1, :cond_16

    :goto_7
    move p1, v2

    goto :goto_8

    :cond_16
    move p1, v4

    :goto_8
    if-eqz p1, :cond_7

    :cond_17
    :goto_9
    return v2
.end method

.method public H(I)V
    .locals 3

    invoke-virtual {p0, p1}, Lc/g;->N(I)Lc/g$i;

    move-result-object v0

    iget-object v1, v0, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    if-eqz v1, :cond_1

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, v0, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v2, v1}, Landroidx/appcompat/view/menu/e;->v(Landroid/os/Bundle;)V

    invoke-virtual {v1}, Landroid/os/Bundle;->size()I

    move-result v2

    if-lez v2, :cond_0

    iput-object v1, v0, Lc/g$i;->p:Landroid/os/Bundle;

    :cond_0
    iget-object v1, v0, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v1}, Landroidx/appcompat/view/menu/e;->y()V

    iget-object v1, v0, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v1}, Landroidx/appcompat/view/menu/e;->clear()V

    :cond_1
    const/4 v1, 0x1

    iput-boolean v1, v0, Lc/g$i;->o:Z

    iput-boolean v1, v0, Lc/g$i;->n:Z

    const/16 v0, 0x6c

    if-eq p1, v0, :cond_2

    if-nez p1, :cond_3

    :cond_2
    iget-object p1, p0, Lc/g;->l:Lh/b0;

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lc/g;->N(I)Lc/g$i;

    move-result-object v0

    iput-boolean p1, v0, Lc/g$i;->k:Z

    const/4 p1, 0x0

    invoke-virtual {p0, v0, p1}, Lc/g;->U(Lc/g$i;Landroid/view/KeyEvent;)Z

    :cond_3
    return-void
.end method

.method public I()V
    .locals 1

    iget-object v0, p0, Lc/g;->s:Le0/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le0/o;->b()V

    :cond_0
    return-void
.end method

.method public final J()V
    .locals 9

    iget-boolean v0, p0, Lc/g;->t:Z

    if-nez v0, :cond_1b

    .line 1
    iget-object v0, p0, Lc/g;->e:Landroid/content/Context;

    sget-object v1, Lb/b;->j:[I

    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/16 v1, 0x73

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_1a

    const/16 v2, 0x7c

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    const/16 v4, 0x6c

    const/4 v5, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {p0, v5}, Lc/g;->t(I)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v4}, Lc/g;->t(I)Z

    :cond_1
    :goto_0
    const/16 v1, 0x74

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    const/16 v2, 0x6d

    if-eqz v1, :cond_2

    invoke-virtual {p0, v2}, Lc/g;->t(I)Z

    :cond_2
    const/16 v1, 0x75

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0xa

    invoke-virtual {p0, v1}, Lc/g;->t(I)Z

    :cond_3
    invoke-virtual {v0, v3, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lc/g;->C:Z

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0}, Lc/g;->K()V

    iget-object v0, p0, Lc/g;->f:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    iget-object v0, p0, Lc/g;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-boolean v1, p0, Lc/g;->D:Z

    const/4 v6, 0x0

    if-nez v1, :cond_9

    iget-boolean v1, p0, Lc/g;->C:Z

    if-eqz v1, :cond_4

    const v1, 0x7f0b000c

    invoke-virtual {v0, v1, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-boolean v3, p0, Lc/g;->A:Z

    iput-boolean v3, p0, Lc/g;->z:Z

    goto/16 :goto_3

    :cond_4
    iget-boolean v0, p0, Lc/g;->z:Z

    if-eqz v0, :cond_8

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iget-object v1, p0, Lc/g;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const v7, 0x7f030009

    invoke-virtual {v1, v7, v0, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v1, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz v1, :cond_5

    new-instance v1, Lf/c;

    iget-object v7, p0, Lc/g;->e:Landroid/content/Context;

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-direct {v1, v7, v0}, Lf/c;-><init>(Landroid/content/Context;I)V

    goto :goto_1

    :cond_5
    iget-object v1, p0, Lc/g;->e:Landroid/content/Context;

    :goto_1
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0b0017

    invoke-virtual {v0, v1, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const v1, 0x7f08006a

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lh/b0;

    iput-object v1, p0, Lc/g;->l:Lh/b0;

    invoke-virtual {p0}, Lc/g;->O()Landroid/view/Window$Callback;

    move-result-object v7

    invoke-interface {v1, v7}, Lh/b0;->setWindowCallback(Landroid/view/Window$Callback;)V

    iget-boolean v1, p0, Lc/g;->A:Z

    if-eqz v1, :cond_6

    iget-object v1, p0, Lc/g;->l:Lh/b0;

    invoke-interface {v1, v2}, Lh/b0;->h(I)V

    :cond_6
    iget-boolean v1, p0, Lc/g;->x:Z

    if-eqz v1, :cond_7

    iget-object v1, p0, Lc/g;->l:Lh/b0;

    const/4 v2, 0x2

    invoke-interface {v1, v2}, Lh/b0;->h(I)V

    :cond_7
    iget-boolean v1, p0, Lc/g;->y:Z

    if-eqz v1, :cond_b

    iget-object v1, p0, Lc/g;->l:Lh/b0;

    const/4 v2, 0x5

    invoke-interface {v1, v2}, Lh/b0;->h(I)V

    goto :goto_3

    :cond_8
    move-object v0, v6

    goto :goto_3

    :cond_9
    iget-boolean v1, p0, Lc/g;->B:Z

    if-eqz v1, :cond_a

    const v1, 0x7f0b0016

    goto :goto_2

    :cond_a
    const v1, 0x7f0b0015

    :goto_2
    invoke-virtual {v0, v1, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    :cond_b
    :goto_3
    if-eqz v0, :cond_19

    new-instance v1, Lc/h;

    invoke-direct {v1, p0}, Lc/h;-><init>(Lc/g;)V

    invoke-static {v0, v1}, Le0/m;->g(Landroid/view/View;Le0/k;)V

    iget-object v1, p0, Lc/g;->l:Lh/b0;

    if-nez v1, :cond_c

    const v1, 0x7f080122

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lc/g;->v:Landroid/widget/TextView;

    :cond_c
    sget-object v1, Lh/a1;->a:Ljava/lang/reflect/Method;

    const-string v1, "ViewUtils"

    .line 2
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v7, "makeOptionalFitsSystemWindows"

    new-array v8, v3, [Ljava/lang/Class;

    invoke-virtual {v2, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->isAccessible()Z

    move-result v7

    if-nez v7, :cond_d

    invoke-virtual {v2, v5}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    :cond_d
    new-array v7, v3, [Ljava/lang/Object;

    invoke-virtual {v2, v0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception v2

    goto :goto_4

    :catch_1
    move-exception v2

    :goto_4
    const-string v7, "Could not invoke makeOptionalFitsSystemWindows"

    invoke-static {v1, v7, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_5

    :catch_2
    const-string v2, "Could not find method makeOptionalFitsSystemWindows. Oh well..."

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_5
    const v1, 0x7f08002d

    .line 3
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/ContentFrameLayout;

    iget-object v2, p0, Lc/g;->f:Landroid/view/Window;

    const v7, 0x1020002

    invoke-virtual {v2, v7}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    if-eqz v2, :cond_f

    :goto_6
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v8

    if-lez v8, :cond_e

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->removeViewAt(I)V

    invoke-virtual {v1, v8}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    goto :goto_6

    :cond_e
    const/4 v8, -0x1

    invoke-virtual {v2, v8}, Landroid/view/ViewGroup;->setId(I)V

    invoke-virtual {v1, v7}, Landroid/widget/FrameLayout;->setId(I)V

    instance-of v8, v2, Landroid/widget/FrameLayout;

    if-eqz v8, :cond_f

    check-cast v2, Landroid/widget/FrameLayout;

    invoke-virtual {v2, v6}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    :cond_f
    iget-object v2, p0, Lc/g;->f:Landroid/view/Window;

    invoke-virtual {v2, v0}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    new-instance v2, Lc/i;

    invoke-direct {v2, p0}, Lc/i;-><init>(Lc/g;)V

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/ContentFrameLayout;->setAttachListener(Landroidx/appcompat/widget/ContentFrameLayout$a;)V

    .line 4
    iput-object v0, p0, Lc/g;->u:Landroid/view/ViewGroup;

    .line 5
    iget-object v0, p0, Lc/g;->d:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_10

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_7

    :cond_10
    iget-object v0, p0, Lc/g;->k:Ljava/lang/CharSequence;

    .line 6
    :goto_7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_13

    iget-object v1, p0, Lc/g;->l:Lh/b0;

    if-eqz v1, :cond_11

    invoke-interface {v1, v0}, Lh/b0;->setWindowTitle(Ljava/lang/CharSequence;)V

    goto :goto_8

    .line 7
    :cond_11
    iget-object v1, p0, Lc/g;->i:Lc/a;

    if-eqz v1, :cond_12

    .line 8
    check-cast v1, Lc/q;

    .line 9
    iget-object v1, v1, Lc/q;->e:Lh/c0;

    invoke-interface {v1, v0}, Lh/c0;->setWindowTitle(Ljava/lang/CharSequence;)V

    goto :goto_8

    .line 10
    :cond_12
    iget-object v1, p0, Lc/g;->v:Landroid/widget/TextView;

    if-eqz v1, :cond_13

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    :cond_13
    :goto_8
    iget-object v0, p0, Lc/g;->u:Landroid/view/ViewGroup;

    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ContentFrameLayout;

    iget-object v1, p0, Lc/g;->f:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    move-result v7

    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    .line 12
    iget-object v8, v0, Landroidx/appcompat/widget/ContentFrameLayout;->h:Landroid/graphics/Rect;

    invoke-virtual {v8, v2, v6, v7, v1}, Landroid/graphics/Rect;->set(IIII)V

    sget-object v1, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 13
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    move-result v1

    if-eqz v1, :cond_14

    .line 14
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->requestLayout()V

    .line 15
    :cond_14
    iget-object v1, p0, Lc/g;->e:Landroid/content/Context;

    sget-object v2, Lb/b;->j:[I

    invoke-virtual {v1, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v1

    const/16 v2, 0x7a

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMajor()Landroid/util/TypedValue;

    move-result-object v6

    invoke-virtual {v1, v2, v6}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    const/16 v2, 0x7b

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMinor()Landroid/util/TypedValue;

    move-result-object v6

    invoke-virtual {v1, v2, v6}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    const/16 v2, 0x78

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_15

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMajor()Landroid/util/TypedValue;

    move-result-object v6

    invoke-virtual {v1, v2, v6}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_15
    const/16 v2, 0x79

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMinor()Landroid/util/TypedValue;

    move-result-object v6

    invoke-virtual {v1, v2, v6}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_16
    const/16 v2, 0x76

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_17

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMajor()Landroid/util/TypedValue;

    move-result-object v6

    invoke-virtual {v1, v2, v6}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_17
    const/16 v2, 0x77

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_18

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMinor()Landroid/util/TypedValue;

    move-result-object v6

    invoke-virtual {v1, v2, v6}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_18
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->requestLayout()V

    .line 16
    iput-boolean v5, p0, Lc/g;->t:Z

    invoke-virtual {p0, v3}, Lc/g;->N(I)Lc/g$i;

    move-result-object v0

    iget-boolean v1, p0, Lc/g;->L:Z

    if-nez v1, :cond_1b

    iget-object v0, v0, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    if-nez v0, :cond_1b

    invoke-virtual {p0, v4}, Lc/g;->Q(I)V

    goto :goto_9

    .line 17
    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "AppCompat does not support the current theme features: { windowActionBar: "

    invoke-static {v1}, Lc/f;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lc/g;->z:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowActionBarOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lc/g;->A:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", android:windowIsFloating: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lc/g;->C:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowActionModeOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lc/g;->B:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowNoTitle: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lc/g;->D:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " }"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You need to use a Theme.AppCompat theme (or descendant) with this activity."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1b
    :goto_9
    return-void
.end method

.method public final K()V
    .locals 2

    iget-object v0, p0, Lc/g;->f:Landroid/view/Window;

    if-nez v0, :cond_0

    iget-object v0, p0, Lc/g;->d:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0, v0}, Lc/g;->B(Landroid/view/Window;)V

    :cond_0
    iget-object v0, p0, Lc/g;->f:Landroid/view/Window;

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "We have not been given a Window"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public L(Landroid/view/Menu;)Lc/g$i;
    .locals 5

    iget-object v0, p0, Lc/g;->F:[Lc/g$i;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    array-length v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-ge v1, v2, :cond_2

    aget-object v3, v0, v1

    if-eqz v3, :cond_1

    iget-object v4, v3, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    if-ne v4, p1, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final M(Landroid/content/Context;)Lc/g$f;
    .locals 3

    iget-object v0, p0, Lc/g;->Q:Lc/g$f;

    if-nez v0, :cond_1

    new-instance v0, Lc/g$g;

    .line 1
    sget-object v1, Lc/p;->d:Lc/p;

    if-nez v1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    new-instance v1, Lc/p;

    const-string v2, "location"

    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/location/LocationManager;

    invoke-direct {v1, p1, v2}, Lc/p;-><init>(Landroid/content/Context;Landroid/location/LocationManager;)V

    sput-object v1, Lc/p;->d:Lc/p;

    :cond_0
    sget-object p1, Lc/p;->d:Lc/p;

    .line 2
    invoke-direct {v0, p0, p1}, Lc/g$g;-><init>(Lc/g;Lc/p;)V

    iput-object v0, p0, Lc/g;->Q:Lc/g$f;

    :cond_1
    iget-object p1, p0, Lc/g;->Q:Lc/g$f;

    return-object p1
.end method

.method public N(I)Lc/g$i;
    .locals 4

    iget-object v0, p0, Lc/g;->F:[Lc/g$i;

    if-eqz v0, :cond_0

    array-length v1, v0

    if-gt v1, p1, :cond_2

    :cond_0
    add-int/lit8 v1, p1, 0x1

    new-array v1, v1, [Lc/g$i;

    if-eqz v0, :cond_1

    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    iput-object v1, p0, Lc/g;->F:[Lc/g$i;

    move-object v0, v1

    :cond_2
    aget-object v1, v0, p1

    if-nez v1, :cond_3

    new-instance v1, Lc/g$i;

    invoke-direct {v1, p1}, Lc/g$i;-><init>(I)V

    aput-object v1, v0, p1

    :cond_3
    return-object v1
.end method

.method public final O()Landroid/view/Window$Callback;
    .locals 1

    iget-object v0, p0, Lc/g;->f:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    return-object v0
.end method

.method public final P()V
    .locals 3

    invoke-virtual {p0}, Lc/g;->J()V

    iget-boolean v0, p0, Lc/g;->z:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lc/g;->i:Lc/a;

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lc/g;->d:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_1

    new-instance v0, Lc/q;

    iget-object v1, p0, Lc/g;->d:Ljava/lang/Object;

    check-cast v1, Landroid/app/Activity;

    iget-boolean v2, p0, Lc/g;->A:Z

    invoke-direct {v0, v1, v2}, Lc/q;-><init>(Landroid/app/Activity;Z)V

    :goto_0
    iput-object v0, p0, Lc/g;->i:Lc/a;

    goto :goto_1

    :cond_1
    instance-of v0, v0, Landroid/app/Dialog;

    if-eqz v0, :cond_2

    new-instance v0, Lc/q;

    iget-object v1, p0, Lc/g;->d:Ljava/lang/Object;

    check-cast v1, Landroid/app/Dialog;

    invoke-direct {v0, v1}, Lc/q;-><init>(Landroid/app/Dialog;)V

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v0, p0, Lc/g;->i:Lc/a;

    if-eqz v0, :cond_3

    iget-boolean v1, p0, Lc/g;->V:Z

    invoke-virtual {v0, v1}, Lc/a;->c(Z)V

    :cond_3
    :goto_2
    return-void
.end method

.method public final Q(I)V
    .locals 3

    iget v0, p0, Lc/g;->T:I

    const/4 v1, 0x1

    shl-int p1, v1, p1

    or-int/2addr p1, v0

    iput p1, p0, Lc/g;->T:I

    iget-boolean p1, p0, Lc/g;->S:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lc/g;->f:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lc/g;->U:Ljava/lang/Runnable;

    sget-object v2, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 1
    invoke-virtual {p1, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 2
    iput-boolean v1, p0, Lc/g;->S:Z

    :cond_0
    return-void
.end method

.method public R(Landroid/content/Context;I)I
    .locals 2

    const/16 v0, -0x64

    const/4 v1, -0x1

    if-eq p2, v0, :cond_5

    if-eq p2, v1, :cond_4

    if-eqz p2, :cond_2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_4

    const/4 v0, 0x2

    if-eq p2, v0, :cond_4

    const/4 v0, 0x3

    if-ne p2, v0, :cond_1

    .line 1
    iget-object p2, p0, Lc/g;->R:Lc/g$f;

    if-nez p2, :cond_0

    new-instance p2, Lc/g$e;

    invoke-direct {p2, p0, p1}, Lc/g$e;-><init>(Lc/g;Landroid/content/Context;)V

    iput-object p2, p0, Lc/g;->R:Lc/g$f;

    :cond_0
    iget-object p1, p0, Lc/g;->R:Lc/g$f;

    .line 2
    :goto_0
    invoke-virtual {p1}, Lc/g$f;->c()I

    move-result p1

    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    const-class v0, Landroid/app/UiModeManager;

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/UiModeManager;

    invoke-virtual {p2}, Landroid/app/UiModeManager;->getNightMode()I

    move-result p2

    if-nez p2, :cond_3

    return v1

    :cond_3
    invoke-virtual {p0, p1}, Lc/g;->M(Landroid/content/Context;)Lc/g$f;

    move-result-object p1

    goto :goto_0

    :cond_4
    return p2

    :cond_5
    return v1
.end method

.method public final S(Lc/g$i;Landroid/view/KeyEvent;)V
    .locals 13

    iget-boolean v0, p1, Lc/g$i;->m:Z

    if-nez v0, :cond_1d

    iget-boolean v0, p0, Lc/g;->L:Z

    if-eqz v0, :cond_0

    goto/16 :goto_d

    :cond_0
    iget v0, p1, Lc/g$i;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    iget-object v0, p0, Lc/g;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v0, v0, 0xf

    const/4 v3, 0x4

    if-ne v0, v3, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    if-eqz v0, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Lc/g;->O()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_3

    iget v3, p1, Lc/g$i;->a:I

    iget-object v4, p1, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    invoke-interface {v0, v3, v4}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0, p1, v2}, Lc/g;->E(Lc/g$i;Z)V

    return-void

    :cond_3
    iget-object v0, p0, Lc/g;->e:Landroid/content/Context;

    const-string v3, "window"

    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    if-nez v0, :cond_4

    return-void

    :cond_4
    invoke-virtual {p0, p1, p2}, Lc/g;->U(Lc/g$i;Landroid/view/KeyEvent;)Z

    move-result p2

    if-nez p2, :cond_5

    return-void

    :cond_5
    iget-object p2, p1, Lc/g$i;->e:Landroid/view/ViewGroup;

    const/4 v3, -0x1

    const/4 v4, -0x2

    if-eqz p2, :cond_7

    iget-boolean v5, p1, Lc/g$i;->n:Z

    if-eqz v5, :cond_6

    goto :goto_1

    :cond_6
    iget-object p2, p1, Lc/g$i;->g:Landroid/view/View;

    if-eqz p2, :cond_1b

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    if-eqz p2, :cond_1b

    iget p2, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-ne p2, v3, :cond_1b

    move v6, v3

    goto/16 :goto_b

    :cond_7
    :goto_1
    if-nez p2, :cond_c

    .line 1
    invoke-virtual {p0}, Lc/g;->P()V

    iget-object p2, p0, Lc/g;->i:Lc/a;

    if-eqz p2, :cond_8

    .line 2
    invoke-virtual {p2}, Lc/a;->b()Landroid/content/Context;

    move-result-object p2

    goto :goto_2

    :cond_8
    const/4 p2, 0x0

    :goto_2
    if-nez p2, :cond_9

    iget-object p2, p0, Lc/g;->e:Landroid/content/Context;

    .line 3
    :cond_9
    new-instance v3, Landroid/util/TypedValue;

    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    invoke-virtual {p2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    const v6, 0x7f030002

    invoke-virtual {v5, v6, v3, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v6, v3, Landroid/util/TypedValue;->resourceId:I

    if-eqz v6, :cond_a

    invoke-virtual {v5, v6, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_a
    const v6, 0x7f0301d6

    invoke-virtual {v5, v6, v3, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v3, v3, Landroid/util/TypedValue;->resourceId:I

    if-eqz v3, :cond_b

    goto :goto_3

    :cond_b
    const v3, 0x7f0e0136

    :goto_3
    invoke-virtual {v5, v3, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    new-instance v3, Lf/c;

    invoke-direct {v3, p2, v1}, Lf/c;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v3}, Lf/c;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p2

    invoke-virtual {p2, v5}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iput-object v3, p1, Lc/g$i;->j:Landroid/content/Context;

    sget-object p2, Lb/b;->j:[I

    invoke-virtual {v3, p2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p2

    const/16 v3, 0x54

    invoke-virtual {p2, v3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p1, Lc/g$i;->b:I

    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p1, Lc/g$i;->d:I

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 4
    new-instance p2, Lc/g$h;

    iget-object v3, p1, Lc/g$i;->j:Landroid/content/Context;

    invoke-direct {p2, p0, v3}, Lc/g$h;-><init>(Lc/g;Landroid/content/Context;)V

    iput-object p2, p1, Lc/g$i;->e:Landroid/view/ViewGroup;

    const/16 p2, 0x51

    iput p2, p1, Lc/g$i;->c:I

    goto :goto_4

    .line 5
    :cond_c
    iget-boolean v3, p1, Lc/g$i;->n:Z

    if-eqz v3, :cond_d

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-lez p2, :cond_d

    iget-object p2, p1, Lc/g$i;->e:Landroid/view/ViewGroup;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 6
    :cond_d
    :goto_4
    iget-object p2, p1, Lc/g$i;->g:Landroid/view/View;

    if-eqz p2, :cond_e

    iput-object p2, p1, Lc/g$i;->f:Landroid/view/View;

    goto :goto_5

    :cond_e
    iget-object p2, p1, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    if-nez p2, :cond_f

    goto :goto_6

    :cond_f
    iget-object p2, p0, Lc/g;->n:Lc/g$j;

    if-nez p2, :cond_10

    new-instance p2, Lc/g$j;

    invoke-direct {p2, p0}, Lc/g$j;-><init>(Lc/g;)V

    iput-object p2, p0, Lc/g;->n:Lc/g$j;

    :cond_10
    iget-object p2, p0, Lc/g;->n:Lc/g$j;

    .line 7
    iget-object v3, p1, Lc/g$i;->i:Landroidx/appcompat/view/menu/c;

    if-nez v3, :cond_11

    new-instance v3, Landroidx/appcompat/view/menu/c;

    iget-object v5, p1, Lc/g$i;->j:Landroid/content/Context;

    const v6, 0x7f0b0010

    invoke-direct {v3, v5, v6}, Landroidx/appcompat/view/menu/c;-><init>(Landroid/content/Context;I)V

    iput-object v3, p1, Lc/g$i;->i:Landroidx/appcompat/view/menu/c;

    .line 8
    iput-object p2, v3, Landroidx/appcompat/view/menu/c;->f:Landroidx/appcompat/view/menu/i$a;

    .line 9
    iget-object p2, p1, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    .line 10
    iget-object v5, p2, Landroidx/appcompat/view/menu/e;->a:Landroid/content/Context;

    invoke-virtual {p2, v3, v5}, Landroidx/appcompat/view/menu/e;->b(Landroidx/appcompat/view/menu/i;Landroid/content/Context;)V

    .line 11
    :cond_11
    iget-object p2, p1, Lc/g$i;->i:Landroidx/appcompat/view/menu/c;

    iget-object v3, p1, Lc/g$i;->e:Landroid/view/ViewGroup;

    .line 12
    iget-object v5, p2, Landroidx/appcompat/view/menu/c;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    if-nez v5, :cond_13

    iget-object v5, p2, Landroidx/appcompat/view/menu/c;->c:Landroid/view/LayoutInflater;

    const v6, 0x7f0b000d

    invoke-virtual {v5, v6, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/view/menu/ExpandedMenuView;

    iput-object v3, p2, Landroidx/appcompat/view/menu/c;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    iget-object v3, p2, Landroidx/appcompat/view/menu/c;->g:Landroidx/appcompat/view/menu/c$a;

    if-nez v3, :cond_12

    new-instance v3, Landroidx/appcompat/view/menu/c$a;

    invoke-direct {v3, p2}, Landroidx/appcompat/view/menu/c$a;-><init>(Landroidx/appcompat/view/menu/c;)V

    iput-object v3, p2, Landroidx/appcompat/view/menu/c;->g:Landroidx/appcompat/view/menu/c$a;

    :cond_12
    iget-object v3, p2, Landroidx/appcompat/view/menu/c;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    iget-object v5, p2, Landroidx/appcompat/view/menu/c;->g:Landroidx/appcompat/view/menu/c$a;

    invoke-virtual {v3, v5}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v3, p2, Landroidx/appcompat/view/menu/c;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    invoke-virtual {v3, p2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    :cond_13
    iget-object p2, p2, Landroidx/appcompat/view/menu/c;->e:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 13
    iput-object p2, p1, Lc/g$i;->f:Landroid/view/View;

    if-eqz p2, :cond_14

    :goto_5
    move p2, v2

    goto :goto_7

    :cond_14
    :goto_6
    move p2, v1

    :goto_7
    if-eqz p2, :cond_1c

    .line 14
    iget-object p2, p1, Lc/g$i;->f:Landroid/view/View;

    if-nez p2, :cond_15

    goto :goto_9

    :cond_15
    iget-object p2, p1, Lc/g$i;->g:Landroid/view/View;

    if-eqz p2, :cond_16

    goto :goto_8

    :cond_16
    iget-object p2, p1, Lc/g$i;->i:Landroidx/appcompat/view/menu/c;

    invoke-virtual {p2}, Landroidx/appcompat/view/menu/c;->a()Landroid/widget/ListAdapter;

    move-result-object p2

    check-cast p2, Landroidx/appcompat/view/menu/c$a;

    invoke-virtual {p2}, Landroidx/appcompat/view/menu/c$a;->getCount()I

    move-result p2

    if-lez p2, :cond_17

    :goto_8
    move p2, v2

    goto :goto_a

    :cond_17
    :goto_9
    move p2, v1

    :goto_a
    if-nez p2, :cond_18

    goto :goto_c

    .line 15
    :cond_18
    iget-object p2, p1, Lc/g$i;->f:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    if-nez p2, :cond_19

    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {p2, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    :cond_19
    iget v3, p1, Lc/g$i;->b:I

    iget-object v5, p1, Lc/g$i;->e:Landroid/view/ViewGroup;

    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->setBackgroundResource(I)V

    iget-object v3, p1, Lc/g$i;->f:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    instance-of v5, v3, Landroid/view/ViewGroup;

    if-eqz v5, :cond_1a

    check-cast v3, Landroid/view/ViewGroup;

    iget-object v5, p1, Lc/g$i;->f:Landroid/view/View;

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1a
    iget-object v3, p1, Lc/g$i;->e:Landroid/view/ViewGroup;

    iget-object v5, p1, Lc/g$i;->f:Landroid/view/View;

    invoke-virtual {v3, v5, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p2, p1, Lc/g$i;->f:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->hasFocus()Z

    move-result p2

    if-nez p2, :cond_1b

    iget-object p2, p1, Lc/g$i;->f:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    :cond_1b
    move v6, v4

    :goto_b
    iput-boolean v1, p1, Lc/g$i;->l:Z

    new-instance p2, Landroid/view/WindowManager$LayoutParams;

    const/4 v7, -0x2

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x3ea

    const/high16 v11, 0x820000

    const/4 v12, -0x3

    move-object v5, p2

    invoke-direct/range {v5 .. v12}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIIIII)V

    iget v1, p1, Lc/g$i;->c:I

    iput v1, p2, Landroid/view/WindowManager$LayoutParams;->gravity:I

    iget v1, p1, Lc/g$i;->d:I

    iput v1, p2, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    iget-object v1, p1, Lc/g$i;->e:Landroid/view/ViewGroup;

    invoke-interface {v0, v1, p2}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iput-boolean v2, p1, Lc/g$i;->m:Z

    return-void

    :cond_1c
    :goto_c
    iput-boolean v2, p1, Lc/g$i;->n:Z

    :cond_1d
    :goto_d
    return-void
.end method

.method public final T(Lc/g$i;ILandroid/view/KeyEvent;I)Z
    .locals 2

    invoke-virtual {p3}, Landroid/view/KeyEvent;->isSystem()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p1, Lc/g$i;->k:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p1, p3}, Lc/g;->U(Lc/g$i;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p1, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p2, p3, p4}, Landroidx/appcompat/view/menu/e;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result v1

    :cond_2
    if-eqz v1, :cond_3

    const/4 p2, 0x1

    and-int/lit8 p3, p4, 0x1

    if-nez p3, :cond_3

    iget-object p3, p0, Lc/g;->l:Lh/b0;

    if-nez p3, :cond_3

    invoke-virtual {p0, p1, p2}, Lc/g;->E(Lc/g$i;Z)V

    :cond_3
    return v1
.end method

.method public final U(Lc/g$i;Landroid/view/KeyEvent;)Z
    .locals 11

    iget-boolean v0, p0, Lc/g;->L:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p1, Lc/g$i;->k:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    return v2

    :cond_1
    iget-object v0, p0, Lc/g;->G:Lc/g$i;

    if-eqz v0, :cond_2

    if-eq v0, p1, :cond_2

    invoke-virtual {p0, v0, v1}, Lc/g;->E(Lc/g$i;Z)V

    :cond_2
    invoke-virtual {p0}, Lc/g;->O()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_3

    iget v3, p1, Lc/g$i;->a:I

    invoke-interface {v0, v3}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, p1, Lc/g$i;->g:Landroid/view/View;

    :cond_3
    iget v3, p1, Lc/g$i;->a:I

    const/16 v4, 0x6c

    if-eqz v3, :cond_5

    if-ne v3, v4, :cond_4

    goto :goto_0

    :cond_4
    move v3, v1

    goto :goto_1

    :cond_5
    :goto_0
    move v3, v2

    :goto_1
    if-eqz v3, :cond_6

    iget-object v5, p0, Lc/g;->l:Lh/b0;

    if-eqz v5, :cond_6

    invoke-interface {v5}, Lh/b0;->d()V

    :cond_6
    iget-object v5, p1, Lc/g$i;->g:Landroid/view/View;

    if-nez v5, :cond_18

    iget-object v5, p1, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    const/4 v6, 0x0

    if-eqz v5, :cond_7

    iget-boolean v7, p1, Lc/g$i;->o:Z

    if-eqz v7, :cond_12

    :cond_7
    if-nez v5, :cond_d

    .line 1
    iget-object v5, p0, Lc/g;->e:Landroid/content/Context;

    iget v7, p1, Lc/g$i;->a:I

    if-eqz v7, :cond_8

    if-ne v7, v4, :cond_c

    :cond_8
    iget-object v4, p0, Lc/g;->l:Lh/b0;

    if-eqz v4, :cond_c

    new-instance v4, Landroid/util/TypedValue;

    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v5}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v7

    const v8, 0x7f030009

    invoke-virtual {v7, v8, v4, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v8, v4, Landroid/util/TypedValue;->resourceId:I

    const v9, 0x7f03000a

    if-eqz v8, :cond_9

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iget v10, v4, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v8, v10, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    invoke-virtual {v8, v9, v4, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    goto :goto_2

    :cond_9
    invoke-virtual {v7, v9, v4, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-object v8, v6

    :goto_2
    iget v9, v4, Landroid/util/TypedValue;->resourceId:I

    if-eqz v9, :cond_b

    if-nez v8, :cond_a

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    :cond_a
    iget v4, v4, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v8, v4, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_b
    if-eqz v8, :cond_c

    new-instance v4, Lf/c;

    invoke-direct {v4, v5, v1}, Lf/c;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4}, Lf/c;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    invoke-virtual {v5, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    move-object v5, v4

    :cond_c
    new-instance v4, Landroidx/appcompat/view/menu/e;

    invoke-direct {v4, v5}, Landroidx/appcompat/view/menu/e;-><init>(Landroid/content/Context;)V

    .line 2
    iput-object p0, v4, Landroidx/appcompat/view/menu/e;->e:Landroidx/appcompat/view/menu/e$a;

    .line 3
    invoke-virtual {p1, v4}, Lc/g$i;->a(Landroidx/appcompat/view/menu/e;)V

    .line 4
    iget-object v4, p1, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    if-nez v4, :cond_d

    return v1

    :cond_d
    if-eqz v3, :cond_f

    iget-object v4, p0, Lc/g;->l:Lh/b0;

    if-eqz v4, :cond_f

    iget-object v5, p0, Lc/g;->m:Lc/g$b;

    if-nez v5, :cond_e

    new-instance v5, Lc/g$b;

    invoke-direct {v5, p0}, Lc/g$b;-><init>(Lc/g;)V

    iput-object v5, p0, Lc/g;->m:Lc/g$b;

    :cond_e
    iget-object v5, p1, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    iget-object v7, p0, Lc/g;->m:Lc/g$b;

    invoke-interface {v4, v5, v7}, Lh/b0;->b(Landroid/view/Menu;Landroidx/appcompat/view/menu/i$a;)V

    :cond_f
    iget-object v4, p1, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v4}, Landroidx/appcompat/view/menu/e;->y()V

    iget v4, p1, Lc/g$i;->a:I

    iget-object v5, p1, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    invoke-interface {v0, v4, v5}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v4

    if-nez v4, :cond_11

    invoke-virtual {p1, v6}, Lc/g$i;->a(Landroidx/appcompat/view/menu/e;)V

    if-eqz v3, :cond_10

    iget-object p1, p0, Lc/g;->l:Lh/b0;

    if-eqz p1, :cond_10

    iget-object p2, p0, Lc/g;->m:Lc/g$b;

    invoke-interface {p1, v6, p2}, Lh/b0;->b(Landroid/view/Menu;Landroidx/appcompat/view/menu/i$a;)V

    :cond_10
    return v1

    :cond_11
    iput-boolean v1, p1, Lc/g$i;->o:Z

    :cond_12
    iget-object v4, p1, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v4}, Landroidx/appcompat/view/menu/e;->y()V

    iget-object v4, p1, Lc/g$i;->p:Landroid/os/Bundle;

    if-eqz v4, :cond_13

    iget-object v5, p1, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v5, v4}, Landroidx/appcompat/view/menu/e;->u(Landroid/os/Bundle;)V

    iput-object v6, p1, Lc/g$i;->p:Landroid/os/Bundle;

    :cond_13
    iget-object v4, p1, Lc/g$i;->g:Landroid/view/View;

    iget-object v5, p1, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    invoke-interface {v0, v1, v4, v5}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_15

    if-eqz v3, :cond_14

    iget-object p2, p0, Lc/g;->l:Lh/b0;

    if-eqz p2, :cond_14

    iget-object v0, p0, Lc/g;->m:Lc/g$b;

    invoke-interface {p2, v6, v0}, Lh/b0;->b(Landroid/view/Menu;Landroidx/appcompat/view/menu/i$a;)V

    :cond_14
    iget-object p1, p1, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/e;->x()V

    return v1

    :cond_15
    if-eqz p2, :cond_16

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result p2

    goto :goto_3

    :cond_16
    const/4 p2, -0x1

    :goto_3
    invoke-static {p2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result p2

    if-eq p2, v2, :cond_17

    move p2, v2

    goto :goto_4

    :cond_17
    move p2, v1

    :goto_4
    iget-object v0, p1, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v0, p2}, Landroidx/appcompat/view/menu/e;->setQwertyMode(Z)V

    iget-object p2, p1, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    invoke-virtual {p2}, Landroidx/appcompat/view/menu/e;->x()V

    :cond_18
    iput-boolean v2, p1, Lc/g$i;->k:Z

    iput-boolean v1, p1, Lc/g$i;->l:Z

    iput-object p1, p0, Lc/g;->G:Lc/g$i;

    return v2
.end method

.method public final V()Z
    .locals 2

    iget-boolean v0, p0, Lc/g;->t:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/g;->u:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    sget-object v1, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 1
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final W()V
    .locals 2

    iget-boolean v0, p0, Lc/g;->t:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/util/AndroidRuntimeException;

    const-string v1, "Window feature must be requested before adding content"

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final X(Le0/s;Landroid/graphics/Rect;)I
    .locals 10

    invoke-virtual {p1}, Le0/s;->d()I

    move-result p2

    iget-object v0, p0, Lc/g;->p:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lc/g;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v3, p0, Lc/g;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v3}, Landroid/view/ViewGroup;->isShown()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_b

    iget-object v3, p0, Lc/g;->W:Landroid/graphics/Rect;

    if-nez v3, :cond_0

    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput-object v3, p0, Lc/g;->W:Landroid/graphics/Rect;

    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput-object v3, p0, Lc/g;->X:Landroid/graphics/Rect;

    :cond_0
    iget-object v3, p0, Lc/g;->W:Landroid/graphics/Rect;

    iget-object v5, p0, Lc/g;->X:Landroid/graphics/Rect;

    invoke-virtual {p1}, Le0/s;->b()I

    move-result v6

    invoke-virtual {p1}, Le0/s;->d()I

    move-result v7

    invoke-virtual {p1}, Le0/s;->c()I

    move-result v8

    invoke-virtual {p1}, Le0/s;->a()I

    move-result p1

    invoke-virtual {v3, v6, v7, v8, p1}, Landroid/graphics/Rect;->set(IIII)V

    iget-object p1, p0, Lc/g;->u:Landroid/view/ViewGroup;

    invoke-static {p1, v3, v5}, Lh/a1;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    iget p1, v3, Landroid/graphics/Rect;->top:I

    iget v5, v3, Landroid/graphics/Rect;->left:I

    iget v3, v3, Landroid/graphics/Rect;->right:I

    iget-object v6, p0, Lc/g;->u:Landroid/view/ViewGroup;

    sget-object v7, Le0/m;->a:Ljava/util/WeakHashMap;

    .line 1
    invoke-static {v6}, Le0/m$c;->a(Landroid/view/View;)Landroid/view/WindowInsets;

    move-result-object v6

    invoke-static {v6}, Le0/s;->h(Landroid/view/WindowInsets;)Le0/s;

    move-result-object v6

    .line 2
    invoke-virtual {v6}, Le0/s;->b()I

    move-result v7

    invoke-virtual {v6}, Le0/s;->c()I

    move-result v6

    iget v8, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-ne v8, p1, :cond_2

    iget v8, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-ne v8, v5, :cond_2

    iget v8, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v8, v3, :cond_1

    goto :goto_0

    :cond_1
    move v3, v2

    goto :goto_1

    :cond_2
    :goto_0
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v5, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move v3, v4

    :goto_1
    if-lez p1, :cond_3

    iget-object p1, p0, Lc/g;->w:Landroid/view/View;

    if-nez p1, :cond_3

    new-instance p1, Landroid/view/View;

    iget-object v5, p0, Lc/g;->e:Landroid/content/Context;

    invoke-direct {p1, v5}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lc/g;->w:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    iget v5, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    const/16 v8, 0x33

    const/4 v9, -0x1

    invoke-direct {p1, v9, v5, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    iput v7, p1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iput v6, p1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    iget-object v5, p0, Lc/g;->u:Landroid/view/ViewGroup;

    iget-object v6, p0, Lc/g;->w:Landroid/view/View;

    invoke-virtual {v5, v6, v9, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_2

    :cond_3
    iget-object p1, p0, Lc/g;->w:Landroid/view/View;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v5, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iget v8, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-ne v5, v8, :cond_4

    iget v5, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-ne v5, v7, :cond_4

    iget v5, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v5, v6, :cond_5

    :cond_4
    iput v8, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iput v7, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v6, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget-object v5, p0, Lc/g;->w:Landroid/view/View;

    invoke-virtual {v5, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_5
    :goto_2
    iget-object p1, p0, Lc/g;->w:Landroid/view/View;

    if-eqz p1, :cond_6

    move v5, v4

    goto :goto_3

    :cond_6
    move v5, v2

    :goto_3
    if-eqz v5, :cond_9

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lc/g;->w:Landroid/view/View;

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getWindowSystemUiVisibility()I

    move-result v6

    and-int/lit16 v6, v6, 0x2000

    if-eqz v6, :cond_7

    goto :goto_4

    :cond_7
    move v4, v2

    :goto_4
    if-eqz v4, :cond_8

    .line 4
    iget-object v4, p0, Lc/g;->e:Landroid/content/Context;

    const v6, 0x7f050006

    goto :goto_5

    :cond_8
    iget-object v4, p0, Lc/g;->e:Landroid/content/Context;

    const v6, 0x7f050005

    :goto_5
    sget-object v7, Lv/a;->a:Ljava/lang/Object;

    .line 5
    invoke-virtual {v4, v6}, Landroid/content/Context;->getColor(I)I

    move-result v4

    .line 6
    invoke-virtual {p1, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 7
    :cond_9
    iget-boolean p1, p0, Lc/g;->B:Z

    if-nez p1, :cond_a

    if-eqz v5, :cond_a

    move p2, v2

    :cond_a
    move v4, v3

    goto :goto_6

    :cond_b
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-eqz p1, :cond_c

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    move v5, v2

    goto :goto_6

    :cond_c
    move v4, v2

    move v5, v4

    :goto_6
    if-eqz v4, :cond_e

    iget-object p1, p0, Lc/g;->p:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_7

    :cond_d
    move v5, v2

    :cond_e
    :goto_7
    iget-object p1, p0, Lc/g;->w:Landroid/view/View;

    if-eqz p1, :cond_10

    if-eqz v5, :cond_f

    move v1, v2

    :cond_f
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_10
    return p2
.end method

.method public a(Landroidx/appcompat/view/menu/e;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lc/g;->l:Lh/b0;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lh/b0;->f()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lc/g;->e:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lc/g;->l:Lh/b0;

    invoke-interface {p1}, Lh/b0;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_0
    invoke-virtual {p0}, Lc/g;->O()Landroid/view/Window$Callback;

    move-result-object p1

    iget-object v2, p0, Lc/g;->l:Lh/b0;

    invoke-interface {v2}, Lh/b0;->e()Z

    move-result v2

    const/16 v3, 0x6c

    if-eqz v2, :cond_1

    iget-object v0, p0, Lc/g;->l:Lh/b0;

    invoke-interface {v0}, Lh/b0;->g()Z

    iget-boolean v0, p0, Lc/g;->L:Z

    if-nez v0, :cond_4

    invoke-virtual {p0, v1}, Lc/g;->N(I)Lc/g$i;

    move-result-object v0

    iget-object v0, v0, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    invoke-interface {p1, v3, v0}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_4

    iget-boolean v2, p0, Lc/g;->L:Z

    if-nez v2, :cond_4

    iget-boolean v2, p0, Lc/g;->S:Z

    if-eqz v2, :cond_2

    iget v2, p0, Lc/g;->T:I

    and-int/2addr v0, v2

    if-eqz v0, :cond_2

    iget-object v0, p0, Lc/g;->f:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lc/g;->U:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lc/g;->U:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_2
    invoke-virtual {p0, v1}, Lc/g;->N(I)Lc/g$i;

    move-result-object v0

    iget-object v2, v0, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    if-eqz v2, :cond_4

    iget-boolean v4, v0, Lc/g$i;->o:Z

    if-nez v4, :cond_4

    iget-object v4, v0, Lc/g$i;->g:Landroid/view/View;

    invoke-interface {p1, v1, v4, v2}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v0, v0, Lc/g$i;->h:Landroidx/appcompat/view/menu/e;

    invoke-interface {p1, v3, v0}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    iget-object p1, p0, Lc/g;->l:Lh/b0;

    invoke-interface {p1}, Lh/b0;->a()Z

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v1}, Lc/g;->N(I)Lc/g$i;

    move-result-object p1

    iput-boolean v0, p1, Lc/g$i;->n:Z

    invoke-virtual {p0, p1, v1}, Lc/g;->E(Lc/g$i;Z)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lc/g;->S(Lc/g$i;Landroid/view/KeyEvent;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public b(Landroidx/appcompat/view/menu/e;Landroid/view/MenuItem;)Z
    .locals 2

    invoke-virtual {p0}, Lc/g;->O()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lc/g;->L:Z

    if-nez v1, :cond_0

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/e;->k()Landroidx/appcompat/view/menu/e;

    move-result-object p1

    invoke-virtual {p0, p1}, Lc/g;->L(Landroid/view/Menu;)Lc/g$i;

    move-result-object p1

    if-eqz p1, :cond_0

    iget p1, p1, Lc/g$i;->a:I

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public c(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    invoke-virtual {p0}, Lc/g;->J()V

    iget-object v0, p0, Lc/g;->u:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lc/g;->g:Lc/g$d;

    .line 1
    iget-object p1, p1, Lf/i;->b:Landroid/view/Window$Callback;

    .line 2
    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V

    return-void
.end method

.method public d(Landroid/content/Context;)Landroid/content/Context;
    .locals 9

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc/g;->I:Z

    .line 1
    iget v1, p0, Lc/g;->M:I

    const/16 v2, -0x64

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    .line 2
    :goto_0
    invoke-virtual {p0, p1, v1}, Lc/g;->R(Landroid/content/Context;I)I

    move-result v1

    sget-boolean v2, Lc/g;->c0:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    instance-of v2, p1, Landroid/view/ContextThemeWrapper;

    if-eqz v2, :cond_1

    invoke-virtual {p0, p1, v1, v3}, Lc/g;->F(Landroid/content/Context;ILandroid/content/res/Configuration;)Landroid/content/res/Configuration;

    move-result-object v2

    :try_start_0
    move-object v4, p1

    check-cast v4, Landroid/view/ContextThemeWrapper;

    .line 3
    invoke-virtual {v4, v2}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 4
    :catch_0
    :cond_1
    instance-of v2, p1, Lf/c;

    if-eqz v2, :cond_2

    invoke-virtual {p0, p1, v1, v3}, Lc/g;->F(Landroid/content/Context;ILandroid/content/res/Configuration;)Landroid/content/res/Configuration;

    move-result-object v2

    :try_start_1
    move-object v4, p1

    check-cast v4, Lf/c;

    invoke-virtual {v4, v2}, Lf/c;->a(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p1

    :catch_1
    :cond_2
    sget-boolean v2, Lc/g;->b0:Z

    if-nez v2, :cond_3

    return-object p1

    :cond_3
    :try_start_2
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Landroid/content/pm/ApplicationInfo;)Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_6

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    move-result v5

    if-nez v5, :cond_1a

    .line 5
    new-instance v5, Landroid/content/res/Configuration;

    invoke-direct {v5}, Landroid/content/res/Configuration;-><init>()V

    const/4 v6, 0x0

    iput v6, v5, Landroid/content/res/Configuration;->fontScale:F

    if-eqz v4, :cond_1b

    invoke-virtual {v2, v4}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    move-result v6

    if-nez v6, :cond_4

    goto/16 :goto_1

    :cond_4
    iget v6, v2, Landroid/content/res/Configuration;->fontScale:F

    iget v7, v4, Landroid/content/res/Configuration;->fontScale:F

    cmpl-float v6, v6, v7

    if-eqz v6, :cond_5

    iput v7, v5, Landroid/content/res/Configuration;->fontScale:F

    :cond_5
    iget v6, v2, Landroid/content/res/Configuration;->mcc:I

    iget v7, v4, Landroid/content/res/Configuration;->mcc:I

    if-eq v6, v7, :cond_6

    iput v7, v5, Landroid/content/res/Configuration;->mcc:I

    :cond_6
    iget v6, v2, Landroid/content/res/Configuration;->mnc:I

    iget v7, v4, Landroid/content/res/Configuration;->mnc:I

    if-eq v6, v7, :cond_7

    iput v7, v5, Landroid/content/res/Configuration;->mnc:I

    :cond_7
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    invoke-virtual {v2}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object v7

    invoke-virtual {v4}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/os/LocaleList;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    invoke-virtual {v5, v8}, Landroid/content/res/Configuration;->setLocales(Landroid/os/LocaleList;)V

    iget-object v7, v4, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    iput-object v7, v5, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 7
    :cond_8
    iget v7, v2, Landroid/content/res/Configuration;->touchscreen:I

    iget v8, v4, Landroid/content/res/Configuration;->touchscreen:I

    if-eq v7, v8, :cond_9

    iput v8, v5, Landroid/content/res/Configuration;->touchscreen:I

    :cond_9
    iget v7, v2, Landroid/content/res/Configuration;->keyboard:I

    iget v8, v4, Landroid/content/res/Configuration;->keyboard:I

    if-eq v7, v8, :cond_a

    iput v8, v5, Landroid/content/res/Configuration;->keyboard:I

    :cond_a
    iget v7, v2, Landroid/content/res/Configuration;->keyboardHidden:I

    iget v8, v4, Landroid/content/res/Configuration;->keyboardHidden:I

    if-eq v7, v8, :cond_b

    iput v8, v5, Landroid/content/res/Configuration;->keyboardHidden:I

    :cond_b
    iget v7, v2, Landroid/content/res/Configuration;->navigation:I

    iget v8, v4, Landroid/content/res/Configuration;->navigation:I

    if-eq v7, v8, :cond_c

    iput v8, v5, Landroid/content/res/Configuration;->navigation:I

    :cond_c
    iget v7, v2, Landroid/content/res/Configuration;->navigationHidden:I

    iget v8, v4, Landroid/content/res/Configuration;->navigationHidden:I

    if-eq v7, v8, :cond_d

    iput v8, v5, Landroid/content/res/Configuration;->navigationHidden:I

    :cond_d
    iget v7, v2, Landroid/content/res/Configuration;->orientation:I

    iget v8, v4, Landroid/content/res/Configuration;->orientation:I

    if-eq v7, v8, :cond_e

    iput v8, v5, Landroid/content/res/Configuration;->orientation:I

    :cond_e
    iget v7, v2, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v7, v7, 0xf

    iget v8, v4, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v8, v8, 0xf

    if-eq v7, v8, :cond_f

    iget v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v7, v8

    iput v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    :cond_f
    iget v7, v2, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v7, v7, 0xc0

    iget v8, v4, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v8, v8, 0xc0

    if-eq v7, v8, :cond_10

    iget v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v7, v8

    iput v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    :cond_10
    iget v7, v2, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v7, v7, 0x30

    iget v8, v4, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v8, v8, 0x30

    if-eq v7, v8, :cond_11

    iget v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v7, v8

    iput v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    :cond_11
    iget v7, v2, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v7, v7, 0x300

    iget v8, v4, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v8, v8, 0x300

    if-eq v7, v8, :cond_12

    iget v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v7, v8

    iput v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    :cond_12
    const/16 v7, 0x1a

    if-lt v6, v7, :cond_14

    .line 8
    iget v6, v2, Landroid/content/res/Configuration;->colorMode:I

    and-int/lit8 v6, v6, 0x3

    iget v7, v4, Landroid/content/res/Configuration;->colorMode:I

    and-int/lit8 v7, v7, 0x3

    if-eq v6, v7, :cond_13

    iget v6, v5, Landroid/content/res/Configuration;->colorMode:I

    or-int/2addr v6, v7

    iput v6, v5, Landroid/content/res/Configuration;->colorMode:I

    :cond_13
    iget v6, v2, Landroid/content/res/Configuration;->colorMode:I

    and-int/lit8 v6, v6, 0xc

    iget v7, v4, Landroid/content/res/Configuration;->colorMode:I

    and-int/lit8 v7, v7, 0xc

    if-eq v6, v7, :cond_14

    iget v6, v5, Landroid/content/res/Configuration;->colorMode:I

    or-int/2addr v6, v7

    iput v6, v5, Landroid/content/res/Configuration;->colorMode:I

    .line 9
    :cond_14
    iget v6, v2, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v6, v6, 0xf

    iget v7, v4, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v7, v7, 0xf

    if-eq v6, v7, :cond_15

    iget v6, v5, Landroid/content/res/Configuration;->uiMode:I

    or-int/2addr v6, v7

    iput v6, v5, Landroid/content/res/Configuration;->uiMode:I

    :cond_15
    iget v6, v2, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v6, v6, 0x30

    iget v7, v4, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v7, v7, 0x30

    if-eq v6, v7, :cond_16

    iget v6, v5, Landroid/content/res/Configuration;->uiMode:I

    or-int/2addr v6, v7

    iput v6, v5, Landroid/content/res/Configuration;->uiMode:I

    :cond_16
    iget v6, v2, Landroid/content/res/Configuration;->screenWidthDp:I

    iget v7, v4, Landroid/content/res/Configuration;->screenWidthDp:I

    if-eq v6, v7, :cond_17

    iput v7, v5, Landroid/content/res/Configuration;->screenWidthDp:I

    :cond_17
    iget v6, v2, Landroid/content/res/Configuration;->screenHeightDp:I

    iget v7, v4, Landroid/content/res/Configuration;->screenHeightDp:I

    if-eq v6, v7, :cond_18

    iput v7, v5, Landroid/content/res/Configuration;->screenHeightDp:I

    :cond_18
    iget v6, v2, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    iget v7, v4, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    if-eq v6, v7, :cond_19

    iput v7, v5, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 10
    :cond_19
    iget v2, v2, Landroid/content/res/Configuration;->densityDpi:I

    iget v4, v4, Landroid/content/res/Configuration;->densityDpi:I

    if-eq v2, v4, :cond_1b

    iput v4, v5, Landroid/content/res/Configuration;->densityDpi:I

    goto :goto_1

    :cond_1a
    move-object v5, v3

    .line 11
    :cond_1b
    :goto_1
    invoke-virtual {p0, p1, v1, v5}, Lc/g;->F(Landroid/content/Context;ILandroid/content/res/Configuration;)Landroid/content/res/Configuration;

    move-result-object v1

    new-instance v2, Lf/c;

    const v4, 0x7f0e0142

    invoke-direct {v2, p1, v4}, Lf/c;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v2, v1}, Lf/c;->a(Landroid/content/res/Configuration;)V

    const/4 v1, 0x0

    :try_start_3
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_2

    if-eqz p1, :cond_1c

    move p1, v0

    goto :goto_2

    :catch_2
    :cond_1c
    move p1, v1

    :goto_2
    if-eqz p1, :cond_20

    invoke-virtual {v2}, Lf/c;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    .line 12
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1d

    if-lt v4, v5, :cond_1d

    .line 13
    invoke-virtual {p1}, Landroid/content/res/Resources$Theme;->rebase()V

    goto :goto_6

    .line 14
    :cond_1d
    sget-object v4, Lw/c;->a:Ljava/lang/Object;

    monitor-enter v4

    :try_start_4
    sget-boolean v5, Lw/c;->c:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez v5, :cond_1e

    :try_start_5
    const-class v5, Landroid/content/res/Resources$Theme;

    const-string v6, "rebase"

    new-array v7, v1, [Ljava/lang/Class;

    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    sput-object v5, Lw/c;->b:Ljava/lang/reflect/Method;

    invoke-virtual {v5, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_3

    :catch_3
    move-exception v5

    :try_start_6
    const-string v6, "ResourcesCompat"

    const-string v7, "Failed to retrieve rebase() method"

    invoke-static {v6, v7, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_3
    sput-boolean v0, Lw/c;->c:Z

    :cond_1e
    sget-object v0, Lw/c;->b:Ljava/lang/reflect/Method;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz v0, :cond_1f

    :try_start_7
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_5

    :catch_4
    move-exception p1

    goto :goto_4

    :catch_5
    move-exception p1

    :goto_4
    :try_start_8
    const-string v0, "ResourcesCompat"

    const-string v1, "Failed to invoke rebase() method via reflection"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    sput-object v3, Lw/c;->b:Ljava/lang/reflect/Method;

    :cond_1f
    :goto_5
    monitor-exit v4

    goto :goto_6

    :catchall_0
    move-exception p1

    monitor-exit v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    throw p1

    :cond_20
    :goto_6
    return-object v2

    :catch_6
    move-exception p1

    .line 15
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Application failed to obtain resources from itself"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public e(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lc/g;->J()V

    iget-object v0, p0, Lc/g;->f:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lc/g;->M:I

    return v0
.end method

.method public g()Landroid/view/MenuInflater;
    .locals 2

    iget-object v0, p0, Lc/g;->j:Landroid/view/MenuInflater;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lc/g;->P()V

    new-instance v0, Lf/g;

    iget-object v1, p0, Lc/g;->i:Lc/a;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lc/a;->b()Landroid/content/Context;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lc/g;->e:Landroid/content/Context;

    :goto_0
    invoke-direct {v0, v1}, Lf/g;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lc/g;->j:Landroid/view/MenuInflater;

    :cond_1
    iget-object v0, p0, Lc/g;->j:Landroid/view/MenuInflater;

    return-object v0
.end method

.method public h()Lc/a;
    .locals 1

    invoke-virtual {p0}, Lc/g;->P()V

    iget-object v0, p0, Lc/g;->i:Lc/a;

    return-object v0
.end method

.method public i()V
    .locals 2

    iget-object v0, p0, Lc/g;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v1

    if-nez v1, :cond_0

    .line 1
    invoke-virtual {v0, p0}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    move-result-object v0

    instance-of v0, v0, Lc/g;

    if-nez v0, :cond_1

    const-string v0, "AppCompatDelegate"

    const-string v1, "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-void
.end method

.method public j()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/g;->P()V

    iget-object v0, p0, Lc/g;->i:Lc/a;

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lc/g;->Q(I)V

    return-void
.end method

.method public k(Landroid/content/res/Configuration;)V
    .locals 3

    iget-boolean p1, p0, Lc/g;->z:Z

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lc/g;->t:Z

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Lc/g;->P()V

    iget-object p1, p0, Lc/g;->i:Lc/a;

    if-eqz p1, :cond_0

    .line 2
    check-cast p1, Lc/q;

    .line 3
    iget-object v0, p1, Lc/q;->a:Landroid/content/Context;

    .line 4
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x7f040000

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    .line 5
    invoke-virtual {p1, v0}, Lc/q;->f(Z)V

    .line 6
    :cond_0
    invoke-static {}, Lh/i;->a()Lh/i;

    move-result-object p1

    iget-object v0, p0, Lc/g;->e:Landroid/content/Context;

    .line 7
    monitor-enter p1

    :try_start_0
    iget-object v1, p1, Lh/i;->a:Lh/l0;

    .line 8
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, v1, Lh/l0;->d:Ljava/util/WeakHashMap;

    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/e;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/e;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 9
    monitor-exit p1

    const/4 p1, 0x0

    .line 10
    invoke-virtual {p0, p1}, Lc/g;->A(Z)Z

    return-void

    :catchall_0
    move-exception v0

    .line 11
    :try_start_3
    monitor-exit v1

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    monitor-exit p1

    throw v0
.end method

.method public l(Landroid/os/Bundle;)V
    .locals 3

    const/4 p1, 0x1

    iput-boolean p1, p0, Lc/g;->I:Z

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lc/g;->A(Z)Z

    invoke-virtual {p0}, Lc/g;->K()V

    iget-object v0, p0, Lc/g;->d:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    :try_start_0
    check-cast v0, Landroid/app/Activity;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1
    :try_start_1
    invoke-virtual {v0}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v2

    invoke-static {v0, v2}, Lu/g;->c(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :goto_0
    if-eqz v1, :cond_1

    .line 2
    iget-object v0, p0, Lc/g;->i:Lc/a;

    if-nez v0, :cond_0

    .line 3
    iput-boolean p1, p0, Lc/g;->V:Z

    goto :goto_1

    :cond_0
    invoke-virtual {v0, p1}, Lc/a;->c(Z)V

    .line 4
    :cond_1
    :goto_1
    sget-object v0, Lc/e;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    invoke-static {p0}, Lc/e;->s(Lc/e;)V

    sget-object v1, Lc/e;->b:Ll/c;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ll/c;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    goto :goto_2

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1

    .line 5
    :cond_2
    :goto_2
    iput-boolean p1, p0, Lc/g;->J:Z

    return-void
.end method

.method public m()V
    .locals 3

    iget-object v0, p0, Lc/g;->d:Ljava/lang/Object;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 1
    sget-object v0, Lc/e;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Lc/e;->s(Lc/e;)V

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 2
    :cond_0
    :goto_0
    iget-boolean v0, p0, Lc/g;->S:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lc/g;->f:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lc/g;->U:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lc/g;->K:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc/g;->L:Z

    iget v0, p0, Lc/g;->M:I

    const/16 v1, -0x64

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lc/g;->d:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_2

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lc/g;->Z:Ll/h;

    iget-object v1, p0, Lc/g;->d:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lc/g;->M:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ll/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    sget-object v0, Lc/g;->Z:Ll/h;

    iget-object v1, p0, Lc/g;->d:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/h;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    iget-object v0, p0, Lc/g;->i:Lc/a;

    if-eqz v0, :cond_3

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    :cond_3
    iget-object v0, p0, Lc/g;->Q:Lc/g$f;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lc/g$f;->a()V

    :cond_4
    iget-object v0, p0, Lc/g;->R:Lc/g$f;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lc/g$f;->a()V

    :cond_5
    return-void
.end method

.method public n(Landroid/os/Bundle;)V
    .locals 0

    invoke-virtual {p0}, Lc/g;->J()V

    return-void
.end method

.method public o()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/g;->P()V

    iget-object v0, p0, Lc/g;->i:Lc/a;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 2
    check-cast v0, Lc/q;

    .line 3
    iput-boolean v1, v0, Lc/q;->u:Z

    :cond_0
    return-void
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 10

    .line 1
    iget-object v0, p0, Lc/g;->Y:Lc/m;

    if-nez v0, :cond_1

    iget-object v0, p0, Lc/g;->e:Landroid/content/Context;

    sget-object v1, Lb/b;->j:[I

    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/16 v1, 0x72

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lc/m;

    invoke-direct {v0}, Lc/m;-><init>()V

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/m;

    iput-object v1, p0, Lc/g;->Y:Lc/m;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to instantiate custom view inflater "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". Falling back to default."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "AppCompatDelegate"

    invoke-static {v2, v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance v0, Lc/m;

    invoke-direct {v0}, Lc/m;-><init>()V

    :goto_0
    iput-object v0, p0, Lc/g;->Y:Lc/m;

    :cond_1
    :goto_1
    const/4 v6, 0x0

    iget-object v1, p0, Lc/g;->Y:Lc/m;

    const/4 v7, 0x0

    const/4 v8, 0x1

    sget v0, Lh/z0;->a:I

    const/4 v9, 0x0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v1 .. v9}, Lc/m;->createView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZZZ)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2, p3}, Lc/g;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public p(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public q()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc/g;->K:Z

    invoke-virtual {p0}, Lc/g;->z()Z

    return-void
.end method

.method public r()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc/g;->K:Z

    .line 1
    invoke-virtual {p0}, Lc/g;->P()V

    iget-object v1, p0, Lc/g;->i:Lc/a;

    if-eqz v1, :cond_0

    .line 2
    check-cast v1, Lc/q;

    .line 3
    iput-boolean v0, v1, Lc/q;->u:Z

    iget-object v0, v1, Lc/q;->t:Lf/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf/h;->a()V

    :cond_0
    return-void
.end method

.method public t(I)Z
    .locals 5

    const-string v0, "AppCompatDelegate"

    const/16 v1, 0x8

    const/16 v2, 0x6d

    const/16 v3, 0x6c

    if-ne p1, v1, :cond_0

    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."

    .line 1
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    move p1, v3

    goto :goto_0

    :cond_0
    const/16 v1, 0x9

    if-ne p1, v1, :cond_1

    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    move p1, v2

    .line 2
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lc/g;->D:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    if-ne p1, v3, :cond_2

    return v1

    :cond_2
    iget-boolean v0, p0, Lc/g;->z:Z

    const/4 v4, 0x1

    if-eqz v0, :cond_3

    if-ne p1, v4, :cond_3

    iput-boolean v1, p0, Lc/g;->z:Z

    :cond_3
    if-eq p1, v4, :cond_9

    const/4 v0, 0x2

    if-eq p1, v0, :cond_8

    const/4 v0, 0x5

    if-eq p1, v0, :cond_7

    const/16 v0, 0xa

    if-eq p1, v0, :cond_6

    if-eq p1, v3, :cond_5

    if-eq p1, v2, :cond_4

    iget-object v0, p0, Lc/g;->f:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->requestFeature(I)Z

    move-result p1

    return p1

    :cond_4
    invoke-virtual {p0}, Lc/g;->W()V

    iput-boolean v4, p0, Lc/g;->A:Z

    return v4

    :cond_5
    invoke-virtual {p0}, Lc/g;->W()V

    iput-boolean v4, p0, Lc/g;->z:Z

    return v4

    :cond_6
    invoke-virtual {p0}, Lc/g;->W()V

    iput-boolean v4, p0, Lc/g;->B:Z

    return v4

    :cond_7
    invoke-virtual {p0}, Lc/g;->W()V

    iput-boolean v4, p0, Lc/g;->y:Z

    return v4

    :cond_8
    invoke-virtual {p0}, Lc/g;->W()V

    iput-boolean v4, p0, Lc/g;->x:Z

    return v4

    :cond_9
    invoke-virtual {p0}, Lc/g;->W()V

    iput-boolean v4, p0, Lc/g;->D:Z

    return v4
.end method

.method public u(I)V
    .locals 2

    invoke-virtual {p0}, Lc/g;->J()V

    iget-object v0, p0, Lc/g;->u:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v1, p0, Lc/g;->e:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    iget-object p1, p0, Lc/g;->g:Lc/g$d;

    .line 1
    iget-object p1, p1, Lf/i;->b:Landroid/view/Window$Callback;

    .line 2
    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V

    return-void
.end method

.method public v(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0}, Lc/g;->J()V

    iget-object v0, p0, Lc/g;->u:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p1, p0, Lc/g;->g:Lc/g$d;

    .line 1
    iget-object p1, p1, Lf/i;->b:Landroid/view/Window$Callback;

    .line 2
    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V

    return-void
.end method

.method public w(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    invoke-virtual {p0}, Lc/g;->J()V

    iget-object v0, p0, Lc/g;->u:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lc/g;->g:Lc/g$d;

    .line 1
    iget-object p1, p1, Lf/i;->b:Landroid/view/Window$Callback;

    .line 2
    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V

    return-void
.end method

.method public x(I)V
    .locals 0

    iput p1, p0, Lc/g;->N:I

    return-void
.end method

.method public final y(Ljava/lang/CharSequence;)V
    .locals 1

    iput-object p1, p0, Lc/g;->k:Ljava/lang/CharSequence;

    iget-object v0, p0, Lc/g;->l:Lh/b0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lh/b0;->setWindowTitle(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1
    :cond_0
    iget-object v0, p0, Lc/g;->i:Lc/a;

    if-eqz v0, :cond_1

    .line 2
    check-cast v0, Lc/q;

    .line 3
    iget-object v0, v0, Lc/q;->e:Lh/c0;

    invoke-interface {v0, p1}, Lh/c0;->setWindowTitle(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lc/g;->v:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public z()Z
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lc/g;->A(Z)Z

    move-result v0

    return v0
.end method
