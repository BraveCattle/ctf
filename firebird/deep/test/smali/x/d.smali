.class public Lx/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation


# static fields
.field public static final a:Lx/j;

.field public static final b:Ll/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll/f<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, Lx/i;

    invoke-direct {v0}, Lx/i;-><init>()V

    goto :goto_1

    :cond_0
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    new-instance v0, Lx/h;

    invoke-direct {v0}, Lx/h;-><init>()V

    goto :goto_1

    :cond_1
    const/16 v1, 0x1a

    if-lt v0, v1, :cond_2

    new-instance v0, Lx/g;

    invoke-direct {v0}, Lx/g;-><init>()V

    goto :goto_1

    .line 1
    :cond_2
    sget-object v0, Lx/f;->d:Ljava/lang/reflect/Method;

    if-nez v0, :cond_3

    const-string v1, "TypefaceCompatApi24Impl"

    const-string v2, "Unable to collect necessary private methods.Fallback to legacy implementation."

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    if-eqz v0, :cond_4

    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_5

    .line 2
    new-instance v0, Lx/f;

    invoke-direct {v0}, Lx/f;-><init>()V

    goto :goto_1

    :cond_5
    new-instance v0, Lx/e;

    invoke-direct {v0}, Lx/e;-><init>()V

    .line 3
    :goto_1
    sput-object v0, Lx/d;->a:Lx/j;

    .line 4
    new-instance v0, Ll/f;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Ll/f;-><init>(I)V

    sput-object v0, Lx/d;->b:Ll/f;

    return-void
.end method

.method public static a(Landroid/content/Context;Lw/a$a;Landroid/content/res/Resources;IILw/b;Landroid/os/Handler;Z)Landroid/graphics/Typeface;
    .locals 4

    instance-of v0, p1, Lw/a$d;

    if-eqz v0, :cond_c

    check-cast p1, Lw/a$d;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p7, :cond_0

    .line 1
    iget v2, p1, Lw/a$d;->c:I

    if-nez v2, :cond_1

    goto :goto_0

    :cond_0
    if-nez p5, :cond_1

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    const/4 v1, -0x1

    if-eqz p7, :cond_2

    .line 2
    iget p7, p1, Lw/a$d;->b:I

    goto :goto_1

    :cond_2
    move p7, v1

    .line 3
    :goto_1
    iget-object p1, p1, Lw/a$d;->a:Lb0/a;

    .line 4
    sget-object v2, Lb0/e;->a:Ll/f;

    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    iget-object v3, p1, Lb0/a;->e:Ljava/lang/String;

    .line 7
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lb0/e;->a:Ll/f;

    invoke-virtual {v3, v2}, Ll/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Typeface;

    if-eqz v3, :cond_3

    if-eqz p5, :cond_e

    invoke-virtual {p5, v3}, Lw/b;->c(Landroid/graphics/Typeface;)V

    goto/16 :goto_4

    :cond_3
    if-eqz v0, :cond_6

    if-ne p7, v1, :cond_6

    invoke-static {p0, p1, p4}, Lb0/e;->b(Landroid/content/Context;Lb0/a;I)Lb0/e$d;

    move-result-object p0

    if-eqz p5, :cond_5

    iget p1, p0, Lb0/e$d;->b:I

    if-nez p1, :cond_4

    iget-object p1, p0, Lb0/e$d;->a:Landroid/graphics/Typeface;

    invoke-virtual {p5, p1, p6}, Lw/b;->b(Landroid/graphics/Typeface;Landroid/os/Handler;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p5, p1, p6}, Lw/b;->a(ILandroid/os/Handler;)V

    :cond_5
    :goto_2
    iget-object v3, p0, Lb0/e$d;->a:Landroid/graphics/Typeface;

    goto/16 :goto_4

    :cond_6
    new-instance v1, Lb0/b;

    invoke-direct {v1, p0, p1, p4, v2}, Lb0/b;-><init>(Landroid/content/Context;Lb0/a;ILjava/lang/String;)V

    const/4 v3, 0x0

    if-eqz v0, :cond_7

    :try_start_0
    sget-object p0, Lb0/e;->b:Lb0/f;

    invoke-virtual {p0, v1, p7}, Lb0/f;->b(Ljava/util/concurrent/Callable;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb0/e$d;

    iget-object v3, p0, Lb0/e$d;->a:Landroid/graphics/Typeface;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :cond_7
    if-nez p5, :cond_8

    move-object p0, v3

    goto :goto_3

    :cond_8
    new-instance p0, Lb0/c;

    invoke-direct {p0, p5, p6}, Lb0/c;-><init>(Lw/b;Landroid/os/Handler;)V

    :goto_3
    sget-object p7, Lb0/e;->c:Ljava/lang/Object;

    monitor-enter p7

    :try_start_1
    sget-object p1, Lb0/e;->d:Ll/h;

    .line 8
    invoke-virtual {p1, v2, v3}, Ll/h;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    .line 9
    check-cast p5, Ljava/util/ArrayList;

    if-eqz p5, :cond_a

    if-eqz p0, :cond_9

    invoke-virtual {p5, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9
    monitor-exit p7

    goto :goto_4

    :cond_a
    if-eqz p0, :cond_b

    new-instance p5, Ljava/util/ArrayList;

    invoke-direct {p5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p5, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v2, p5}, Ll/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    monitor-exit p7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object p0, Lb0/e;->b:Lb0/f;

    new-instance p1, Lb0/d;

    invoke-direct {p1, v2}, Lb0/d;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    new-instance p5, Landroid/os/Handler;

    invoke-direct {p5}, Landroid/os/Handler;-><init>()V

    new-instance p6, Lb0/g;

    invoke-direct {p6, p0, v1, p5, p1}, Lb0/g;-><init>(Lb0/f;Ljava/util/concurrent/Callable;Landroid/os/Handler;Lb0/f$c;)V

    invoke-virtual {p0, p6}, Lb0/f;->a(Ljava/lang/Runnable;)V

    goto :goto_4

    :catchall_0
    move-exception p0

    .line 11
    :try_start_2
    monitor-exit p7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0

    .line 12
    :cond_c
    sget-object p7, Lx/d;->a:Lx/j;

    check-cast p1, Lw/a$b;

    invoke-virtual {p7, p0, p1, p2, p4}, Lx/j;->a(Landroid/content/Context;Lw/a$b;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    move-result-object v3

    if-eqz p5, :cond_e

    if-eqz v3, :cond_d

    invoke-virtual {p5, v3, p6}, Lw/b;->b(Landroid/graphics/Typeface;Landroid/os/Handler;)V

    goto :goto_4

    :cond_d
    const/4 p0, -0x3

    invoke-virtual {p5, p0, p6}, Lw/b;->a(ILandroid/os/Handler;)V

    :catch_0
    :cond_e
    :goto_4
    if-eqz v3, :cond_f

    sget-object p0, Lx/d;->b:Ll/f;

    invoke-static {p2, p3, p4}, Lx/d;->c(Landroid/content/res/Resources;II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v3}, Ll/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    return-object v3
.end method

.method public static b(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;
    .locals 6

    sget-object v0, Lx/d;->a:Lx/j;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lx/j;->d(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p1, p2, p4}, Lx/d;->c(Landroid/content/res/Resources;II)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lx/d;->b:Ll/f;

    invoke-virtual {p2, p1, p0}, Ll/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public static c(Landroid/content/res/Resources;II)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "-"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
